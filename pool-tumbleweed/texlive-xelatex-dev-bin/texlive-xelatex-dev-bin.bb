SUMMARY = "Binary files of xelatex-dev"
DESCRIPTION = "Binary files of xelatex-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-xelatex-dev-bin-2023.20230311.svn53999-92.1.aarch64.rpm"
RPM_HASH = "44c31910d8d45f3f7ee24d6a1f92834bc85b8231df07403a4bbabe07ccbd912e9a7a4e36a6c93d1b1f9cae4a520d0140d495df598343b33c44bd9b111e007116"

RPROVIDES:${PN} += "texlive-xelatex-dev-bin"

RDEPENDS:${PN} += "texlive-xelatex-dev"

inherit rpm
