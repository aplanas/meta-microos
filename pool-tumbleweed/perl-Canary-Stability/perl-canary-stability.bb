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

RPM_NAME = "perl-Canary-Stability-2013-1.17.noarch.rpm"
RPM_HASH = "e45187507ba6deeca167818053025ca859f75270534f97d70750228b08930ecc0634234419aede321541e7daa1d35b653de92d24e06b61127e762d1d943d18fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Canary--Stability \
perl-Canary-Stability"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
