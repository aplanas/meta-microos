SUMMARY = "Documentation for texlive-pygmentex"
DESCRIPTION = "This package includes the documentation for texlive-pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-doc-2023.209.0.0.11svn64131-54.2.noarch.rpm"
RPM_HASH = "f63067f8c5e123b74bcaaf657fbdb2786dff973ffb4ce02830b21de895925a90b2b6c8f2e27b3917a20b1c3d937154cf721598181b40180f1ea4ec9094e3789e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
