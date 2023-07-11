SUMMARY = "Binary files of xpdfopen"
DESCRIPTION = "Binary files of xpdfopen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xpdfopen-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "76435ab4446e77bd4cf2c4f1595138fbac73a90fa65993c134443e4f62f5b4dabfd2ee454d2abc86e74637ac440c2fc36c158ff16375ae5a4c9275de35f2ea76"

RPROVIDES:${PN} += "texlive-xpdfopen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
texlive-xpdfopen"

inherit rpm
