SUMMARY = "Documentation for texlive-xevlna"
DESCRIPTION = "This package includes the documentation for texlive-xevlna"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn43864"

RPM_NAME = "texlive-xevlna-doc-2023.209.1.1svn43864-53.2.noarch.rpm"
RPM_HASH = "cb8bfd35a2cebf2ff6365e790ee80a7d6da177e875389e2359fc6e8459543061b9405c7d4dfc53e5aa30985c93cd7e96cf961c724b7f276fd50cf255c3a46054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xevlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
