SUMMARY = "Documentation for texlive-ltb2bib"
DESCRIPTION = "This package includes the documentation for texlive-ltb2bib"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.01svn43746"

RPM_NAME = "texlive-ltb2bib-doc-2023.208.0.0.01svn43746-53.1.noarch.rpm"
RPM_HASH = "d1fe4b7d40557fc9d18382c7c8757e766f9e6c2a5687376a86246f6aec0237cc0ef250da756c63c41942c0dcbb3617d38b9bdc58514f54fc13023ace040a92cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltb2bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
