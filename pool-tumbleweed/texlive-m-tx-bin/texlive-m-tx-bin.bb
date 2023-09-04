SUMMARY = "Binary files of m-tx"
DESCRIPTION = "Binary files of m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-m-tx-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "2162fc4a0e6e9e9db2b97814cb115c0365c41e235d9f17168f38aa1ac22e2c065be8754a880ed14ba958d78d3f21e21cf140a683dc699c2b673fcd9dbbdec428"

RPROVIDES:${PN} += "texlive-m-tx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-m-tx"

inherit rpm
