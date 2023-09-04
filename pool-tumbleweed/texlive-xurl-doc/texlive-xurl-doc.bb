SUMMARY = "Documentation for texlive-xurl"
DESCRIPTION = "This package includes the documentation for texlive-xurl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10svn61553"

RPM_NAME = "texlive-xurl-doc-2023.209.0.0.10svn61553-53.2.noarch.rpm"
RPM_HASH = "24b298f4d37d86bbb74a9ea20730d336582ed8ee84943b9636ea0edd953f5e9745418f982ac824231499f2bc623147a8393b5d0a04bbcf49f1b2964e88d74b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
