SUMMARY = "Documentation for texlive-combofont"
DESCRIPTION = "This package includes the documentation for texlive-combofont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn51348"

RPM_NAME = "texlive-combofont-doc-2023.209.0.0.3svn51348-54.1.noarch.rpm"
RPM_HASH = "adcb57a13ebe7f0a4a9d7858050ff8b3cea9ba7eed400a466b15fdc3605bd7f84aead46f94f6ae398143ee402f5deac8413250e25ced2bd45e63f7419c223cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combofont-doc"

RDEPENDS:${PN} += ""

inherit rpm
