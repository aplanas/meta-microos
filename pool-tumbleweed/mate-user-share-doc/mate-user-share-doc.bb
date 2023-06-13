SUMMARY = "Documentation how to Use mate-user-share"
DESCRIPTION = "This package contains the documentation for mate-user-share"
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-user-share-doc-1.26.0-1.9.noarch.rpm"
RPM_HASH = "b0a4f5351fd671c9485480d38b327cb715d672f2d027315589ae7df270f2c6d6e7cf0dd8368ea6187034befcfcd78c13b5da3210f8e217d2f2b9dd35aadbff36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-user-share-doc"

RDEPENDS:${PN} += ""

inherit rpm
