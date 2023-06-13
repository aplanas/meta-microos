SUMMARY = "Free DTS Coherent Acoustics decoder tools"
DESCRIPTION = "libdca is a free library for decoding DTS Coherent Acoustics \
streams. It is released under the terms of the GPL license. The DTS \
Coherent Acoustics standard is used in a variety of applications, \
including DVD, DTS audio CD and radio broadcasting. \
 \
This package contains tools for decoding DTS Coherent Acoustics \
streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7+2"

RPM_NAME = "dcatools-0.0.7+2-1.2.aarch64.rpm"
RPM_HASH = "9e55057776bf1cd6de705ed87db3e2f95c697df128b421e2df208dc2bcff1549e668f230908ec668ab328155e41fe40c020c696c0a93b5241893dd93fd5422fb"

RPROVIDES:${PN} += "dcatools \
dcatools(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdca.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
