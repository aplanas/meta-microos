SUMMARY = "Binary files of cweb"
DESCRIPTION = "Binary files of cweb"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cweb-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "6e6e4f3633f70d410d79eae6dfde1f79b6a3d0a9f3a4cbf823d304b1df8debad8890f297b83cbc6953ff8dd5a1a45a9193f7c23a7627da74ec50984d48dc86b6"

RPROVIDES:${PN} += "texlive-cweb-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cweb"

inherit rpm
