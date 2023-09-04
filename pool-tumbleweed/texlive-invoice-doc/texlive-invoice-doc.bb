SUMMARY = "Documentation for texlive-invoice"
DESCRIPTION = "This package includes the documentation for texlive-invoice"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48359"

RPM_NAME = "texlive-invoice-doc-2023.209.svn48359-54.1.noarch.rpm"
RPM_HASH = "1cfd9453867a66c887363dfb7fa5d5b67ead86ae2441f6a8aed8884876a0d67bd7696864fa3b651dce88b016ee713978dde80e01f9566f2bdb7ea40fb5098592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-doc"

RDEPENDS:${PN} += ""

inherit rpm
