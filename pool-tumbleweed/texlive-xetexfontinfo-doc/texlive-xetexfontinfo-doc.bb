SUMMARY = "Documentation for texlive-xetexfontinfo"
DESCRIPTION = "This package includes the documentation for texlive-xetexfontinfo"
LICENSE = "Apache-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-xetexfontinfo-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "0f2a32e854bf7a0ac3d4b48ab26766e1cf6a06b521ac6ab1c68ca7aa5f54be235315ab27acb29ae47674b7a730c426706d7c35bc320bb8d3efa2b17984958305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexfontinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
