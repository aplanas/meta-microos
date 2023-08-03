SUMMARY = "Documentation for texlive-newenviron"
DESCRIPTION = "This package includes the documentation for texlive-newenviron"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29331"

RPM_NAME = "texlive-newenviron-doc-2023.209.1.0svn29331-55.1.noarch.rpm"
RPM_HASH = "9cbfaba6b6c7f323cd399863c49023652972b65dfa87806ed77152f88023ba4aa12604abf99111ee1de654688668816280882fe13c72187f46c5a3c9a78e5a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newenviron-doc"

RDEPENDS:${PN} += ""

inherit rpm
