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

RPM_NAME = "perl-Canary-Stability-2013-1.15.noarch.rpm"
RPM_HASH = "7ab7a362715672bcad6e56fadaf27b824bc60a6cabe8dd059a96b711c1d633ae80bd7a7cdc3b5979fc8d2af75b217673e3128d222da84f2d1e0f52d444ecce73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Canary::Stability) \
perl-Canary-Stability"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
