SUMMARY = "Binary files of latexindent"
DESCRIPTION = "Binary files of latexindent"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32150"

RPM_NAME = "texlive-latexindent-bin-2023.20230311.svn32150-93.2.aarch64.rpm"
RPM_HASH = "d8d9fdc39c31d571a31c56e24ee5f39b01c304f52039a16035ec564c2dc1ade4968ea611ba8a94cfcaee25533ffbcdd06f075d2d8d16502240cd6ac054f48bc4"

RPROVIDES:${PN} += "texlive-latexindent-bin"

RDEPENDS:${PN} += "texlive-latexindent"

inherit rpm
