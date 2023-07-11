SUMMARY = "A sendto integration for Thunar"
DESCRIPTION = "This package add sendto integration for Thunar."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "thunar-sendto-blueman-2.3.5-1.4.noarch.rpm"
RPM_HASH = "f1b8ab3a6e3e79c478e78c8666909e74a38ad09c390716b76e8edea2a7595694dcda7da8c0275760fc88fb5baa468f2fa5353941ef484609733f52abbcf3e5e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "thunar-sendto-blueman"

RDEPENDS:${PN} += "blueman"

inherit rpm
