SUMMARY = "Binary files of autosp"
DESCRIPTION = "Binary files of autosp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-autosp-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "8a25d2afc7d6c51e1a90f3bfe16fec9c32668814bf35419af79c2b485a732ca16f2a98cb341d805e35f2fc5e17423bc5a9d2ce7649b1dbe017574cad97d42e1a"

RPROVIDES:${PN} += "texlive-autosp-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-autosp"

inherit rpm
