SUMMARY = "Binary files of gregoriotex"
DESCRIPTION = "Binary files of gregoriotex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gregoriotex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "be427faf6470860001ffcabf7e7a37422641c6eaebb4b329ccd91cbddf7cc76693d57dba6c27086d2eb3ab707aa238155613d0c3a5e5797a4967030b1b1c9660"

RPROVIDES:${PN} += "texlive-gregoriotex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gregoriotex"

inherit rpm
