SUMMARY = "Binary files of dvidvi"
DESCRIPTION = "Binary files of dvidvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvidvi-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "e6e02840c7c48c2e89c9d0b842bc12183a57b8116df58943d9d52c59999a7f8bd2a3093dd8e0b98f0ae30ea806e390aab49c85864f2a060c17f86496e613b8c0"

RPROVIDES:${PN} += "texlive-dvidvi-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-dvidvi"

inherit rpm
