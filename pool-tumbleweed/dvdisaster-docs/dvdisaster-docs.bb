SUMMARY = "PDF Documentation for dvdisaster"
DESCRIPTION = "Documentation package for using dvdisaster in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.6"

RPM_NAME = "dvdisaster-docs-0.79.6-3.7.noarch.rpm"
RPM_HASH = "e7a36b367acab0c4364e1ecaef722c40d5bb7bd27433fe7d17bbbe5b7762793e4225cb4fccca7bd20e4c71a47ae0ca68f044a51e3b5ea4ef5639c4d06f6db002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dvdisaster-docs"
RDEPENDS:${PN} += ""

inherit rpm
