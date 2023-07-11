SUMMARY = "Binary files of dvipos"
DESCRIPTION = "Binary files of dvipos"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-dvipos-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "4a836aafa5e6b61cf012a3a4a4bfab94e9f4c6f68f139e7375a15527fed804a47007e30a7f5e8a597a0c0220a9861ed0392a1ba5767ef7dd4ce3863da241fd70"

RPROVIDES:${PN} += "texlive-dvipos-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvipos"

inherit rpm
