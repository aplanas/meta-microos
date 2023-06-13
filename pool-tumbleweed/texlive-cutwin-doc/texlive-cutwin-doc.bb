SUMMARY = "Documentation for texlive-cutwin"
DESCRIPTION = "This package includes the documentation for texlive-cutwin"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2svn60901"

RPM_NAME = "texlive-cutwin-doc-2023.204.0.0.2svn60901-54.1.noarch.rpm"
RPM_HASH = "6610cd19660985829221b7c60b9aeb4cc34697481271d1b02f71233ba4e972b0d4d5046fa57837031b3443505d7a690b4f38dfe2986e0f747a4f5570f808dbb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cutwin-doc"

RDEPENDS:${PN} += ""

inherit rpm
