SUMMARY = "XCB utility module for XImage/XShmImage-like functions"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- image: Port of Xlib's XImage and XShmImage functions."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libxcb-image0-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "ea714ef02fb809fdb8ed158682714dbccfe7f5aeeca5587b836656cec7937a8d9e4c00f36b3a15e6e4af8f187cdf1b7ffcf3a75f7279492f2a7af4d8715990f8"

RPROVIDES:${PN} += "libxcb-image.so.0 \
libxcb-image0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-shm.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
