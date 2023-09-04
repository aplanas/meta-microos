SUMMARY = "Documentation for texlive-engpron"
DESCRIPTION = "This package includes the documentation for texlive-engpron"
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn16558"

RPM_NAME = "texlive-engpron-doc-2023.209.2svn16558-54.2.noarch.rpm"
RPM_HASH = "1628c67bfa0ec5a1e9b034086f5003764957293a428d118f98649743aa2536f6ca055281589312392f4a4244cf60629023541d4efd5f6aaf101bbd681d533106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engpron-doc-fr;en \
texlive-engpron-doc"

RDEPENDS:${PN} += ""

inherit rpm
