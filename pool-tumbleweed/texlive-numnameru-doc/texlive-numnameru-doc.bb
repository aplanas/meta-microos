SUMMARY = "Documentation for texlive-numnameru"
DESCRIPTION = "This package includes the documentation for texlive-numnameru"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44895"

RPM_NAME = "texlive-numnameru-doc-2023.209.svn44895-55.1.noarch.rpm"
RPM_HASH = "5f9e547b108ee9f0479653deff329b6c619c28c480bee7d7c891f57a383547bdbf3c989a28849887126cd01f26ace19c40f25cc8fa396699525ac6e6bac38531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numnameru-doc"

RDEPENDS:${PN} += ""

inherit rpm
