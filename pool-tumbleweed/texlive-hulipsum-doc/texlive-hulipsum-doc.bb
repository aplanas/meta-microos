SUMMARY = "Documentation for texlive-hulipsum"
DESCRIPTION = "This package includes the documentation for texlive-hulipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56848"

RPM_NAME = "texlive-hulipsum-doc-2023.209.1.1svn56848-54.1.noarch.rpm"
RPM_HASH = "c4d03b49c83ce9c9b46aea48d6c1c21883e1b340a7ce3095c43a79e3d304d1a44d1a7cb9308fda5d1ba2ff021783b8493c408c1d0c78920e6a1715df4fc6d388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hulipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
