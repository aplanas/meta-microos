SUMMARY = "DTS Coherent Acoustics decoder library"
DESCRIPTION = "libdca is a free library for decoding DTS Coherent Acoustics \
streams. It is released under the terms of the GPL license. The DTS \
Coherent Acoustics standard is used in a variety of applications, \
including DVD, DTS audio CD and radio broadcasting. \
 \
This package contains the library for decoding DTS Coherent \
Acoustics streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7+2"

RPM_NAME = "libdca0-0.0.7+2-1.2.aarch64.rpm"
RPM_HASH = "42227e5c35a4cf78811a4f4084b5bb449080c6b4a389c5c84c1606d5afe677f7401d1599299c911804dfe4a3e2b3a61881475044087bd61b48ada8fc2227a685"

RPROVIDES:${PN} += "libdca.so.0()(64bit) \
libdca0 \
libdca0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
