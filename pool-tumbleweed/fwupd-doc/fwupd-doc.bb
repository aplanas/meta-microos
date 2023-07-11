SUMMARY = "Developer documentation for fwupd"
DESCRIPTION = "Developer documentation for fwupd."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "fwupd-doc-1.8.16-2.1.noarch.rpm"
RPM_HASH = "b91c64535021a3f5c12aaddf8ab96a596fdf7cc84f004c6add21b3715c1e4a4f3330444e242079dbff5a33916ff5756a6b8d4f369b06f5f6f74c88d3d922f9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-doc"

RDEPENDS:${PN} += ""

inherit rpm
