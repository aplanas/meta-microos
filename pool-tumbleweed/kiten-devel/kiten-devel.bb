SUMMARY = "Development files for kiten"
DESCRIPTION = "Kiten is a tool to learn Japanese. \
 \
This package contains files for developing applications using kiten."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kiten-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8c5c52f369f2832099d2daa28cf1c29c470feff17890ba4ab0065098d4116697c3c5a371c01e260fd449f2970a754519e5b924d749b2114c6740b5df1af9e334"

RPROVIDES:${PN} += "kiten-devel"

RDEPENDS:${PN} += "kiten"

inherit rpm
