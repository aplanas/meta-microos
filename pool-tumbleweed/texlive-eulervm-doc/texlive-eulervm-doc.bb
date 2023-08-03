SUMMARY = "Documentation for texlive-eulervm"
DESCRIPTION = "This package includes the documentation for texlive-eulervm"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn15878"

RPM_NAME = "texlive-eulervm-doc-2023.209.4.0svn15878-53.1.noarch.rpm"
RPM_HASH = "b907b911f9d6769b153b3888ab995d8abf3055694c45e88af0595f45fc281baf16cec02120151f4edbafbdd30ddf6099ce24cd0a97d92601067700f6c7d5f964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eulervm-doc"

RDEPENDS:${PN} += ""

inherit rpm
