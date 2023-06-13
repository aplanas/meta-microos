SUMMARY = "Address translation library used primarily by libkdumpfile"
DESCRIPTION = "A library that provides an abstraction layer for translating addresses \
between address spaces (i.e. physical vs virtual). \
 \
This package contains the libaddrxlat library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libaddrxlat3-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "e036d7211cafcddcb4d503bcb8bacb979eb7766e8f3c029d375a5bedfa744eac785dc362e71c4d83e40f8b9ecb2e252c3e1284137be9eeb5a6b6d93958dec353"

RPROVIDES:${PN} += "libaddrxlat.so.3()(64bit) \
libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) \
libaddrxlat3 \
libaddrxlat3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
