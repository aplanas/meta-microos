SUMMARY = "Documentation for texlive-termcal"
DESCRIPTION = "This package includes the documentation for texlive-termcal"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn22514"

RPM_NAME = "texlive-termcal-doc-2023.201.1.8svn22514-54.1.noarch.rpm"
RPM_HASH = "8d1d7bc0e12d9d8ea96583c4bb2cd92691733bbad562e13ce9f5022aeb5eba87bc7f1f45754bc12bf416e44df7b018f152a4ccb66c0cde6aec48644798093376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
