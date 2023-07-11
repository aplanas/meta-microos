SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kalzium-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "94b101116de283b086c287d73e7e45d0324b5a0e32e4bce25645c705f5642ef85aff36aa49633b6dc7744467d9d6dd3476c2c08dd55c28724a4df8d6b518d311"

RPROVIDES:${PN} += "kalzium-devel"

RDEPENDS:${PN} += "kalzium"

inherit rpm
