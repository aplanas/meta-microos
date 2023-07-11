SUMMARY = "X current working directory"
DESCRIPTION = "xcwd is a simple tool which print the current working directory of the currently focused window."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "xcwd-1.0-1.10.aarch64.rpm"
RPM_HASH = "8eb802118ebfcc2c9013bc505bdbf4762f66c8d9f758bcc41eeb0acf6efa96ece98c64079884d210feee30169743c0c7bf12023e1efb55813cbe820f57c73fc8"

RPROVIDES:${PN} += "xcwd"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6"

inherit rpm
