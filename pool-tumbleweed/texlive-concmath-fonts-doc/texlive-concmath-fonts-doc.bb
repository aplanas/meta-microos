SUMMARY = "Documentation for texlive-concmath-fonts"
DESCRIPTION = "This package includes the documentation for texlive-concmath-fonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17218"

RPM_NAME = "texlive-concmath-fonts-doc-2023.209.svn17218-54.1.noarch.rpm"
RPM_HASH = "5403a629ec7018a40bbcc7b8fc5f095d518ce5c3e3363b774726f91a3542234a3819937148092f5a8f73551cb225503c66747d74405160fbe469c98b49490b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
