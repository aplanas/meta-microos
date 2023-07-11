SUMMARY = "Documentation for texlive-xetexfontinfo"
DESCRIPTION = "This package includes the documentation for texlive-xetexfontinfo"
LICENSE = "Apache-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-xetexfontinfo-doc-2023.201.svn15878-52.2.noarch.rpm"
RPM_HASH = "514eecda85e6c20347e3253df2ff74cd71c654a6d90924c06e96a0a192078125027f8a18f555d2eb9c2defd4a63b8709f06288b8b465bc3de56cbdf7ff4af0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexfontinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
