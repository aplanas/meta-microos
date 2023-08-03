SUMMARY = "Documentation for texlive-zlmtt"
DESCRIPTION = "This package includes the documentation for texlive-zlmtt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn64076"

RPM_NAME = "texlive-zlmtt-doc-2023.209.1.032svn64076-53.1.noarch.rpm"
RPM_HASH = "1592b1ee517136b5fd9010eee3679c8854db5cd0ee2862a5c10730656408ff955674ba39615d24d461468a8cfe23baaf7681f5e6f572bb9838e6a564e17675e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zlmtt-doc"

RDEPENDS:${PN} += ""

inherit rpm
