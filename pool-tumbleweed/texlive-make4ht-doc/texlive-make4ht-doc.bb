SUMMARY = "Documentation for texlive-make4ht"
DESCRIPTION = "This package includes the documentation for texlive-make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3msvn66130"

RPM_NAME = "texlive-make4ht-doc-2023.208.0.0.3msvn66130-53.1.noarch.rpm"
RPM_HASH = "adc451f1887d0d767291e2d641edfad999c37914194c7918821ade2da4220c02b5ca83caa359507f4e13bda35af04147ab465a2503c68076eeffc78460c86b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-make4ht-doc"

RDEPENDS:${PN} += ""

inherit rpm
