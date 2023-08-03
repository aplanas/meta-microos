SUMMARY = "Documentation for texlive-lm-math"
DESCRIPTION = "This package includes the documentation for texlive-lm-math"
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.959svn36915"

RPM_NAME = "texlive-lm-math-doc-2023.209.1.959svn36915-55.1.noarch.rpm"
RPM_HASH = "396939e46c71e22498c913320ba09c4a448218779abbd7fe54dc895943b25947a68c51279e14ae2c71143d9c07f6d600a54ef3cd169362abb2d9284a5d891d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
