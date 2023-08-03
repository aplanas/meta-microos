SUMMARY = "Documentation for texlive-msg"
DESCRIPTION = "This package includes the documentation for texlive-msg"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.51svn49578"

RPM_NAME = "texlive-msg-doc-2023.209.0.0.51svn49578-55.1.noarch.rpm"
RPM_HASH = "6b4dee5806fdce0ebf4e2b0011e4f2efe82731f324dc8db7afb79d0f95be348b11fb6e8c4df7e8dd0489ec121ca01b7a22659431307a43b3a67d2e2cd99c7e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msg-doc"

RDEPENDS:${PN} += ""

inherit rpm
