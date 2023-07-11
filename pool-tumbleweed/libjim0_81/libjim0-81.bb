SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming language."
LICENSE = "BSD-2-Clause"

PV = "0.81"

RPM_NAME = "libjim0_81-0.81-1.4.aarch64.rpm"
RPM_HASH = "cfa39e52fcb19fe42a076c78fa4131679821d63ac8a43a9d3a985a6425d6c6e0d4c25cb2afac1ccd41029d1402361fba9a72719525a48af01958aa525f9f3e0d"

RPROVIDES:${PN} += "libjim.so.0.81 \
libjim0-81"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
