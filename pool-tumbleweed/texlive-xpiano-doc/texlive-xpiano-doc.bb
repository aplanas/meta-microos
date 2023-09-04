SUMMARY = "Documentation for texlive-xpiano"
DESCRIPTION = "This package includes the documentation for texlive-xpiano"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-xpiano-doc-2023.209.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "ac7b466fd9062e0b6bfecc89665a162e6acfe0a306bd4a3d6aa74e6adbac9145f144603dd7895c9f101fb424fdefd8b0c6db3e0469e08f954e78494fe0f5b4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpiano-doc"

RDEPENDS:${PN} += ""

inherit rpm
