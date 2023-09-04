SUMMARY = "Binary files of seetexk"
DESCRIPTION = "Binary files of seetexk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-seetexk-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "1f8835965335fb32d4c76aaf73da089df915f3cb3853a67c3abbf9b3d3a008d75e0f07ac370fc6f04f1f2843bd3ef6995fe4b09af1e229489dcad26a131f0fa4"

RPROVIDES:${PN} += "texlive-seetexk-bin"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-seetexk"

inherit rpm
