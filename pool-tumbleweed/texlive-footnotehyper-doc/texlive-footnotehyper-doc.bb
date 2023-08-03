SUMMARY = "Documentation for texlive-footnotehyper"
DESCRIPTION = "This package includes the documentation for texlive-footnotehyper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1esvn60374"

RPM_NAME = "texlive-footnotehyper-doc-2023.209.1.1esvn60374-53.1.noarch.rpm"
RPM_HASH = "76c948a79a97d37e50ada4313a8f13023b593e8276b58f08005668e14f641a245de8f3aa02a71e0326043033a7ff1fd7ef0d985a187701a806fc80e2aaece94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnotehyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
