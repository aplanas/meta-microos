SUMMARY = "Binary files of pdflatexpicscale"
DESCRIPTION = "Binary files of pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41779"

RPM_NAME = "texlive-pdflatexpicscale-bin-2023.20230311.svn41779-93.1.aarch64.rpm"
RPM_HASH = "67612bfe59c303d0c2ec61a6424d0733b5516dd2dd46abcff0c6538db5f34e2d2b70147eaf5a85f66ac94a9cc0f4bcfa559e0ae302e6e92772861b149b2d1d77"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-bin"

RDEPENDS:${PN} += "texlive-pdflatexpicscale"

inherit rpm
