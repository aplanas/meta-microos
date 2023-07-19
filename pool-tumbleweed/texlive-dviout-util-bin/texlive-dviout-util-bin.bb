SUMMARY = "Binary files of dviout-util"
DESCRIPTION = "Binary files of dviout-util"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviout-util-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "c7c4299ff1540e15681b6aad7e1036f9d004c209f8b0b24aa74e22887af3e7092b01719b20ab5775f66f02412d6c7fd260ebdda495de0b7bb909cd28d758fb1e"

RPROVIDES:${PN} += "texlive-dviout-util-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libptexenc.so.1 \
texlive-dviout-util"

inherit rpm
