SUMMARY = "Efficient generation of combinatorial sequences"
DESCRIPTION = "Algorithm::Combinatorics is an efficient generator of combinatorial \
sequences. Algorithms are selected from the literature (work in progress, \
see the /REFERENCES manpage). Iterators do not use recursion, nor stacks, \
and are written in C. \
 \
Tuples are generated in lexicographic order, except in 'subsets()'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.27"

RPM_NAME = "perl-Algorithm-Combinatorics-0.27-1.38.aarch64.rpm"
RPM_HASH = "7deedb660a4d29e34e9d8bc3fb239e4aabfec50c5314678ffac3b8935c51191703f8689b42e32b17bb3ddb39085bfa48bc409ac4b9cbbba0db178d35eb286372"

RPROVIDES:${PN} += "perl-Algorithm--Combinatorics \
perl-Algorithm--Combinatorics--Iterator \
perl-Algorithm--Combinatorics--JustCoderef \
perl-Algorithm-Combinatorics"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
