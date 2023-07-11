SUMMARY = "Documentation for texlive-gregoriotex"
DESCRIPTION = "This package includes the documentation for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-doc-2023.201.6.0.0svn58331-53.2.noarch.rpm"
RPM_HASH = "81050c818e7c5842bb19cbd1d4e1190087789c4264736ca6d04d24bfdf8f1563eaf3c6fa7d575db6cbf13d11dc2e4b828b534d88a0d3a104cfe2e4f809c849c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gregoriotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
