SUMMARY = "A Linux System call fuzz tester"
DESCRIPTION = "The basic idea is fairly simple. As 'fuzz testing' suggests, we call syscalls \
at random, with random arguments.  Not an original idea, and one that has been \
done many times before on Linux, and on other operating systems.  Where \
Trinity differs is that the arguments it passes are not purely random."
LICENSE = "GPL-2.0-only"

PV = "1.9+git.20230109"

RPM_NAME = "trinity-1.9+git.20230109-1.3.aarch64.rpm"
RPM_HASH = "b6da70c643d6d7f3354f44a1bb6efb4847a3f586443227d3a2144bb8d897c9fc4bebc831079271b8355c9669b4e75194bc424edddb27b4714edd111e75e78c94"

RPROVIDES:${PN} += "trinity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
