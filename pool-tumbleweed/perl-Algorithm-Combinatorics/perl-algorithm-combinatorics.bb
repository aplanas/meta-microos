SUMMARY = "Efficient generation of combinatorial sequences"
DESCRIPTION = "Algorithm::Combinatorics is an efficient generator of combinatorial \
sequences. Algorithms are selected from the literature (work in progress, \
see the /REFERENCES manpage). Iterators do not use recursion, nor stacks, \
and are written in C. \
 \
Tuples are generated in lexicographic order, except in 'subsets()'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.27"

RPM_NAME = "perl-Algorithm-Combinatorics-0.27-1.39.aarch64.rpm"
RPM_HASH = "c47555f7652a35d5baa8fb6105d4d8d32fbf1459f41c7c3205d59671a5778a5757ece87ee3a888ce8271f5236c2539fec7d9ec998576240a9e4d442d333af0ea"

RPROVIDES:${PN} += "perl-Algorithm--Combinatorics \
perl-Algorithm--Combinatorics--Iterator \
perl-Algorithm--Combinatorics--JustCoderef \
perl-Algorithm-Combinatorics"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
