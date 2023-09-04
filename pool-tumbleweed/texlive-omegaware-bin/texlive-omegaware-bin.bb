SUMMARY = "Binary files of omegaware"
DESCRIPTION = "Binary files of omegaware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-omegaware-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "17893df830e1c3911c3ff2be52c583953a54b34f215d460d6b570f4f7fd70796d1b0851ac59bbca256a44a5d85a3a4a01747918c647f84c8423270fff695521a"

RPROVIDES:${PN} += "texlive-omegaware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-omegaware \
texlive-uptex-bin"

inherit rpm
