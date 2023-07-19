SUMMARY = "Binary files of chktex"
DESCRIPTION = "Binary files of chktex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-chktex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "a4c8ec1789608f549686e1c8668487e6ef66f4e2b7e93690da019887fce5bb8d0236d966350a35ff2bdfdd34785452dba63abcb1675ac525ba71dd77aa1dac5f"

RPROVIDES:${PN} += "texlive-chktex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-chktex"

inherit rpm
