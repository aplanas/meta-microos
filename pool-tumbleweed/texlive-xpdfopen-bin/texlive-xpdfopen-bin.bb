SUMMARY = "Binary files of xpdfopen"
DESCRIPTION = "Binary files of xpdfopen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xpdfopen-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "8aa961fa8b86635fe0dfe1d5763f27b732890d9de2e7109ba30b927f923b69217a6e023931b050abcfc5d8fd800f6ae76837b19353772542c5c7e3406265c74d"

RPROVIDES:${PN} += "texlive-xpdfopen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
texlive-xpdfopen"

inherit rpm
