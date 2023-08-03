SUMMARY = "Documentation for texlive-fcolumn"
DESCRIPTION = "This package includes the documentation for texlive-fcolumn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.1svn61855"

RPM_NAME = "texlive-fcolumn-doc-2023.209.1.4.1svn61855-53.1.noarch.rpm"
RPM_HASH = "6f2750b09d7c656308e2748c261cded62c82047e594b14ad7db990654bcf8be9004e59b61aead46d17ebbd601ed4b00259298d396abb910988e539abcf407e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fcolumn-doc"

RDEPENDS:${PN} += ""

inherit rpm
