SUMMARY = "Documentation for texlive-auto-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-auto-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn56596"

RPM_NAME = "texlive-auto-pst-pdf-doc-2023.201.0.0.7svn56596-53.1.noarch.rpm"
RPM_HASH = "90ecb240117f4fda730a8cbcf85ddefdd36e5534b03ee62359fa16143d327b88f814db603ba9293f13637f0dad71d89fa3dd534f95c18cafe56abced5702ea68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-auto-pst-pdf-doc:en) \
texlive-auto-pst-pdf-doc"
RDEPENDS:${PN} += ""

inherit rpm
