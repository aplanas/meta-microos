SUMMARY = "Documentation for texlive-ieeetran"
DESCRIPTION = "This package includes the documentation for texlive-ieeetran"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-doc-2023.201.1.8bsvn59672-52.1.noarch.rpm"
RPM_HASH = "8dcd76970daa6bcdc4993fccace798ede1407b3aca8ed7ab558c22307d90c3003396e0c1a0b45ff01d349b45fb16580cc68201dd9ccea262876867433dc4388d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
