SUMMARY = "Documentation for Guake"
DESCRIPTION = "Guake is a dropdown terminal made for the GNOME desktop environment. \
 \
This package provides the HTML documentation for Guake."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "guake-doc-3.10-1.1.noarch.rpm"
RPM_HASH = "af39d4716cee94528bfb57f26a10ba4ad9ac8704ea995889d7b9fc7415d23d1800b991460f4cf976abe53f208c8ecec11e8f4efe4fc657739e8cd013abe62811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake-doc"

RDEPENDS:${PN} += "guake"

inherit rpm
