SUMMARY = "Documentation for texlive-semproc"
DESCRIPTION = "This package includes the documentation for texlive-semproc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn37568"

RPM_NAME = "texlive-semproc-doc-2023.209.0.0.1svn37568-54.1.noarch.rpm"
RPM_HASH = "5cdfbbeedd1baf7a722baeeb9766ce03c07eb268b17284174405e8d8388e53c0a22bf25e3efef9a33cb63607e146521c853c6c4ed597a68c995fd11fdacd380a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
