SUMMARY = "Documentation for texlive-tkz-fct"
DESCRIPTION = "This package includes the documentation for texlive-tkz-fct"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7csvn61949"

RPM_NAME = "texlive-tkz-fct-doc-2023.209.1.7csvn61949-53.1.noarch.rpm"
RPM_HASH = "872e4bfa12abf5a2aae4cadb8c64325e793e66d79e3f110649b1fbf0fb48ece8825247052adca0bcce98e56199eee129267480c6eb988af1ec0139a9f4c51efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-fct-doc-fr \
texlive-tkz-fct-doc"

RDEPENDS:${PN} += ""

inherit rpm
