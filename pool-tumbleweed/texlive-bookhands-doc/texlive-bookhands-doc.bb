SUMMARY = "Documentation for texlive-bookhands"
DESCRIPTION = "This package includes the documentation for texlive-bookhands"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46480"

RPM_NAME = "texlive-bookhands-doc-2023.209.svn46480-53.1.noarch.rpm"
RPM_HASH = "878ce9cbce2e34d10da120be9be3955d04f7294b7d7340c4c51bb7a4f971246d68d8ad57da03a22d15c984d0099ec0f7ba27da3a99dfee29877f0c7d8698bcac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookhands-doc"

RDEPENDS:${PN} += ""

inherit rpm
