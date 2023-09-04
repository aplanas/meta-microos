SUMMARY = "Binary files of chktex"
DESCRIPTION = "Binary files of chktex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-chktex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "3706778f54c24fcbfc11920f183b68ba1da055f504ca0606aee799b6db1dd3c742d214226214b7e41042e08051719192eabcce727e5c03c4448794558faf85f7"

RPROVIDES:${PN} += "texlive-chktex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-chktex"

inherit rpm
