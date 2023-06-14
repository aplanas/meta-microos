SUMMARY = "Tools based on libdxfrw"
DESCRIPTION = "This package includes tools based on libdxfrw."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0~rc1+git.20220905"

RPM_NAME = "libdxfrw-tools-1.1.0~rc1+git.20220905-1.3.aarch64.rpm"
RPM_HASH = "fcff361af729288365263e2a7077a10f080dcafa45612d58a541977d91f892a9040c245b9a13868678e454e28746a1806bad3e86d9d2bcaac7863b30ca0277e1"

RPROVIDES:${PN} += "libdxfrw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdxfrw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
