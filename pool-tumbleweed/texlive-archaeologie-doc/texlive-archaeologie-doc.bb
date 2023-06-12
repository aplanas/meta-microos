SUMMARY = "Documentation for texlive-archaeologie"
DESCRIPTION = "This package includes the documentation for texlive-archaeologie"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4.5svn57090"

RPM_NAME = "texlive-archaeologie-doc-2023.201.2.4.5svn57090-54.1.noarch.rpm"
RPM_HASH = "23aa661921d8a0b76a61cd33ebe786703acb4cd798dfe077d50a10174829cf4cbc52a036e0718490570843de061503007de7fbd5626c02ddf5aab10657711d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archaeologie-doc"
RDEPENDS:${PN} += ""

inherit rpm
