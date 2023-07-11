SUMMARY = "Documentation for texlive-grfext"
DESCRIPTION = "This package includes the documentation for texlive-grfext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53024"

RPM_NAME = "texlive-grfext-doc-2023.201.1.3svn53024-53.2.noarch.rpm"
RPM_HASH = "1493150d30f4cbed57b820c296d9beb25da23f2d8172dc7fac64e07d23f1c6b5b4838c08079aed0a63ad01bbfc510c4fc8d7399cd5135fd12dac0bb92de0a1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfext-doc"

RDEPENDS:${PN} += ""

inherit rpm
