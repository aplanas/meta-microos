SUMMARY = "A Linux System call fuzz tester"
DESCRIPTION = "The basic idea is fairly simple. As 'fuzz testing' suggests, we call syscalls \
at random, with random arguments.  Not an original idea, and one that has been \
done many times before on Linux, and on other operating systems.  Where \
Trinity differs is that the arguments it passes are not purely random."
LICENSE = "GPL-2.0-only"

PV = "1.9+git.20230109"

RPM_NAME = "trinity-1.9+git.20230109-1.4.aarch64.rpm"
RPM_HASH = "afd73512b38335e4f2826db7fad815710020b67b3665266f5852c026e96ccc14a0b73f4fb5d336b3a232ab89b9a1a96138f54600b753fdb834a375d30cc792c2"

RPROVIDES:${PN} += "trinity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
