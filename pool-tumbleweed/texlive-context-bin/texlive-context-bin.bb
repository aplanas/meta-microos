SUMMARY = "Binary files of context"
DESCRIPTION = "Binary files of context"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66562"

RPM_NAME = "texlive-context-bin-2023.20230311.svn66562-93.1.aarch64.rpm"
RPM_HASH = "9ffec21ec86cc5729b99d2b96acd7a9340cb86bef64a80dfdb0827f94fe947fb498e774c690ba842bfa8663cd1dad50b1aed77697cf2ed98e5628cdc718c3e1e"

RPROVIDES:${PN} += "texlive-context-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-context"

inherit rpm
