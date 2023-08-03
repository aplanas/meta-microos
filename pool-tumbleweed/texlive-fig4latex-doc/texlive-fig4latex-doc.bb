SUMMARY = "Documentation for texlive-fig4latex"
DESCRIPTION = "This package includes the documentation for texlive-fig4latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn26313"

RPM_NAME = "texlive-fig4latex-doc-2023.209.0.0.2svn26313-53.1.noarch.rpm"
RPM_HASH = "c307f1e5e6883e1b235f729d53cd12db5c1a5dcb208cc7f797b0d97710803012badcd79221b58dba46cf7664c586c8baa62ed9724ab51bcd19712f95d9a2f4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fig4latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
