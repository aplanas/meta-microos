SUMMARY = "Binary files of vlna"
DESCRIPTION = "Binary files of vlna"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-vlna-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "ff663fe21d967146a5983be57bf15f1244cf5be290c234eaadfbcf0161da7d39d3dd1681f92422d22fe0fa5fa6b6baa3fd8f5d6e67150f6b80f0dc647c9b3077"

RPROVIDES:${PN} += "texlive-vlna-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-vlna"

inherit rpm
