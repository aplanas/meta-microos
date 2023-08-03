SUMMARY = "Documentation for texlive-mugsthesis"
DESCRIPTION = "This package includes the documentation for texlive-mugsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64259"

RPM_NAME = "texlive-mugsthesis-doc-2023.209.1.1svn64259-55.1.noarch.rpm"
RPM_HASH = "8541f26b86c06c6937d1f9504eeed8221ca37b574d145352a51382da19d0a6659c8eb981ecfca4427262744b592189f7c255b1776ec8710574dedea5dc6fdd90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mugsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
