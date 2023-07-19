SUMMARY = "Binary files of autosp"
DESCRIPTION = "Binary files of autosp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-autosp-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "4ad30b4510022b05aa9238d0b30b425ec5c58f1d25e2b17594c81063c03a590c6bee150ce52c33ea5612b9ecb85d81d372e639868eece3ae56c60c07d5a56398"

RPROVIDES:${PN} += "texlive-autosp-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-autosp"

inherit rpm
