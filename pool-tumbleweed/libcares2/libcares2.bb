SUMMARY = "Library for asynchronous name resolves"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides the shared libraries for c-ares."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "libcares2-1.19.1-1.1.aarch64.rpm"
RPM_HASH = "2ec73fed4c58742c79ba2369d8df11a190c9fba582c422d7980c0ee16a7290c0d525e62fe295174b8e01fb7437f6f0176a2fc5476810e9403899795a43af231b"

RPROVIDES:${PN} += "libcares.so.2()(64bit) \
libcares2 \
libcares2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnss_usrfiles2 \
netcfg"

inherit rpm
