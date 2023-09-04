SUMMARY = "Tools for Working with the GIF Library"
DESCRIPTION = "A tool for converting GIFs to various formats."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "giflib-progs-5.2.1-4.1.aarch64.rpm"
RPM_HASH = "cc546ac18b98651dcdc0b8f551347f8c8b824a7c61d05879b450628163ded9ad4fe00a58f90b15922fe6ccde5a969aa043864b3593d6420278ea9537468d6803"

RPROVIDES:${PN} += "giflib-progs \
ungif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
