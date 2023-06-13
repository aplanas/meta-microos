SUMMARY = "Documentation for texlive-epstopdf"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.31svn66461"

RPM_NAME = "texlive-epstopdf-doc-2023.201.2.31svn66461-53.1.noarch.rpm"
RPM_HASH = "620995c1802b567c0e2b141f307583ca7716e14935931f12ab6ae5a853ad6859380a1f4be9be4475bef35511cbd7e3ac91da3814d2a0f92623f94bf13066ec42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(epstopdf.1) \
man(repstopdf.1) \
texlive-epstopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
