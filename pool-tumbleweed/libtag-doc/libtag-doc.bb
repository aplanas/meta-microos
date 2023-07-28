SUMMARY = "API documentation for taglib"
DESCRIPTION = "This package contains the taglib API Documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "libtag-doc-1.13.1-1.1.noarch.rpm"
RPM_HASH = "8e2308da711cb77bdeb2200004b4c8cfd04446db169fbbc1452da23e38a808ac0ce6fb0bcada7df05f7526df68f55e51624c2b0d1d40d9a0c3236bfbb581d2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtag-doc"

RDEPENDS:${PN} += ""

inherit rpm
