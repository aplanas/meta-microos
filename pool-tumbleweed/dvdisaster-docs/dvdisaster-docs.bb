SUMMARY = "PDF Documentation for dvdisaster"
DESCRIPTION = "Documentation package for using dvdisaster in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.10"

RPM_NAME = "dvdisaster-docs-0.79.10-1.1.noarch.rpm"
RPM_HASH = "d283d112f6f378b8cc872dfb5a9ee6ea5bc5f5704ab5adcc14ad7f2f53ced6c125106e966ea3e6389eb4f6337820cb021044be76467ce04c309df6e3d7c33563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dvdisaster-docs"

RDEPENDS:${PN} += ""

inherit rpm
