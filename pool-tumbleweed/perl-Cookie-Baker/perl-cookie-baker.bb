SUMMARY = "Cookie string generator / parser"
DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Cookie-Baker-0.11-1.15.noarch.rpm"
RPM_HASH = "255ea6fc99931163fa7e3d5b6fbdcacb0c6a5550db0953c6bb3657a19ca2432e3585f5483430918c26a657e71f1ed01af2dcd2e0c2eca88d1f25570c7b00fea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Cookie::Baker) \
perl-Cookie-Baker"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(URI::Escape)"

inherit rpm
