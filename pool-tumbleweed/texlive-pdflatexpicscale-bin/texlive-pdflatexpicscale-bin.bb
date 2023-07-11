SUMMARY = "Binary files of pdflatexpicscale"
DESCRIPTION = "Binary files of pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41779"

RPM_NAME = "texlive-pdflatexpicscale-bin-2023.20230311.svn41779-92.1.aarch64.rpm"
RPM_HASH = "ca06f45371734644b26dc8c294551f2e232b7883f2d2c66158bd48c3b156d60280ac6932afe2f6e23bc6ffe4904373be1637338162772f631e4da49210c877af"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-bin"

RDEPENDS:${PN} += "texlive-pdflatexpicscale"

inherit rpm
