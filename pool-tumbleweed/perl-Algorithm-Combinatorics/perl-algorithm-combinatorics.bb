SUMMARY = "Efficient generation of combinatorial sequences"
DESCRIPTION = "Algorithm::Combinatorics is an efficient generator of combinatorial \
sequences. Algorithms are selected from the literature (work in progress, \
see the /REFERENCES manpage). Iterators do not use recursion, nor stacks, \
and are written in C. \
 \
Tuples are generated in lexicographic order, except in 'subsets()'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.27"

RPM_NAME = "perl-Algorithm-Combinatorics-0.27-1.37.aarch64.rpm"
RPM_HASH = "eee824d9bbf8bda5304a42c1a187eb5cdfbbb0157f8603e7583bf81486d12c2ffff8b38b3446b390e631516012a4893e8b3fd6a008433edb168031623c4b8681"

RPROVIDES:${PN} += "perl-Algorithm--Combinatorics \
perl-Algorithm--Combinatorics--Iterator \
perl-Algorithm--Combinatorics--JustCoderef \
perl-Algorithm-Combinatorics"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
