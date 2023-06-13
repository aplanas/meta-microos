SUMMARY = "Documentation for texlive-bodeplot"
DESCRIPTION = "This package includes the documentation for texlive-bodeplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn65074"

RPM_NAME = "texlive-bodeplot-doc-2023.201.1.1.3svn65074-52.1.noarch.rpm"
RPM_HASH = "30bc8c4b41f2c8c89959efca91d8beebb51cba3731c69c66929a27fb5dc0ae81ed672538f3f00bbfb09805933fba161714e45315a39e90ad1c80aa0432d40004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bodeplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
