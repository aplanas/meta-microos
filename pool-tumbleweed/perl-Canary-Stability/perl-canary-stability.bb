SUMMARY = "Canary to check perl compatibility for schmorp's modules"
DESCRIPTION = "This module is used by Schmorp's modules during configuration stage to test \
the installed perl for compatibility with his modules. \
 \
It's not, at this stage, meant as a tool for other module authors, although \
in principle nothing prevents them from subscribing to the same ideas. \
 \
See the _Makefile.PL_ in Coro or AnyEvent for usage examples."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2013"

RPM_NAME = "perl-Canary-Stability-2013-1.16.noarch.rpm"
RPM_HASH = "96fa02de7ac77d48539bcacaa5ca6cc28cb1ab3572c0d3d0830bfcb6a72455a26fbaf261efa8ca208ed818874f544f3deea67e770b99e2d23c7f6021c32ca5cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Canary--Stability \
perl-Canary-Stability"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
