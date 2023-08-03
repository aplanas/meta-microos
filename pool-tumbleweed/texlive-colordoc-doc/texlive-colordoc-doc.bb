SUMMARY = "Documentation for texlive-colordoc"
DESCRIPTION = "This package includes the documentation for texlive-colordoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18270"

RPM_NAME = "texlive-colordoc-doc-2023.209.svn18270-54.1.noarch.rpm"
RPM_HASH = "d62136fe04dbeddbd6227beb9aef032f10d45beb3c943bd0bf41657007b98049384e659b91b740baba909b445aba773ab52220dcb49c5f09fd7b2e553ededa74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colordoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
