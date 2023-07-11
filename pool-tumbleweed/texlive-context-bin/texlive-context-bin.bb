SUMMARY = "Binary files of context"
DESCRIPTION = "Binary files of context"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66562"

RPM_NAME = "texlive-context-bin-2023.20230311.svn66562-92.1.aarch64.rpm"
RPM_HASH = "546c8dcc72ef73f962996297e4e5b7645406f314363a26f1f2cd98bdcbc110234890c512dd8edcc506388a1c2d21436864f4ca4d20b3bf199aa4dc2e41ead73c"

RPROVIDES:${PN} += "texlive-context-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-context"

inherit rpm
