SUMMARY = "Documentation for texlive-fonttable"
DESCRIPTION = "This package includes the documentation for texlive-fonttable"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6csvn44799"

RPM_NAME = "texlive-fonttable-doc-2023.201.1.6csvn44799-52.1.noarch.rpm"
RPM_HASH = "1a7fb2a86038e314f55634be1afe1e987f3fa8423a39df45083f303f104f406ccfde341eded75e42207558f7218ec29baf6ddd4ce721eef7d14cd605c7edafd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonttable-doc"
RDEPENDS:${PN} += ""

inherit rpm
