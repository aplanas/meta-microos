SUMMARY = "Binary files of mptopdf"
DESCRIPTION = "Binary files of mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18674"

RPM_NAME = "texlive-mptopdf-bin-2023.20230311.svn18674-92.1.aarch64.rpm"
RPM_HASH = "4ca67a38adc9129d4e3d97866428cdff787d5a49fa4c00b7ebc9040d88f9b6537c45f6af45cbc6bdf7ee6c5a29a86aa4db4b1ac271098fda7a011efd59d7c3a8"

RPROVIDES:${PN} += "texlive-mptopdf-bin"

RDEPENDS:${PN} += "texlive-mptopdf"

inherit rpm
