SUMMARY = "Binary files of upmendex"
DESCRIPTION = "Binary files of upmendex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-upmendex-bin-2023.20230311.svn66511-93.2.aarch64.rpm"
RPM_HASH = "4f3bf355cffcc09503f5255084c9e0a743ba962cbd6f4b05b5b2b5006e12ac5f31ab56fdd6d57f583df27b3464a2ce80c76822a682da9499db6b105ddea36b37"

RPROVIDES:${PN} += "texlive-upmendex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libkpathsea.so.6 \
texlive-upmendex"

inherit rpm
