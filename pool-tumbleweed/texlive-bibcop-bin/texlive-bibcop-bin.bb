SUMMARY = "Binary files of bibcop"
DESCRIPTION = "Binary files of bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65257"

RPM_NAME = "texlive-bibcop-bin-2023.20230311.svn65257-92.1.aarch64.rpm"
RPM_HASH = "5fdc9a266085bc3c4416a6680ecc9e6587dd2abb3d9acab22d382a767509a9cb53b1cadd36f4635d5efce6870b68877f72e648a49c50a81229ddf3f363b3032e"

RPROVIDES:${PN} += "texlive-bibcop-bin"

RDEPENDS:${PN} += "texlive-bibcop"

inherit rpm
