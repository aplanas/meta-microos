SUMMARY = "Binary files of m-tx"
DESCRIPTION = "Binary files of m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-m-tx-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "0587e9c86a17c8cfb15c02cccb85e39434151f12b7d17138066483a3467dee0d70495b13976c8688d4cb5033544ed7a8401830f23c27900753609658532f823f"

RPROVIDES:${PN} += "texlive-m-tx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-m-tx"

inherit rpm
