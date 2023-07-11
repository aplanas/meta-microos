SUMMARY = "API for FRRouting's OSPFv2 implementation"
DESCRIPTION = "This library contains part of the OSPFv2 implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrospfapiclient0-8.4-4.2.aarch64.rpm"
RPM_HASH = "75625c63528168d4240f027e912d3daf9d8a0c5f336ea2ed4f5634d985fe7f8a4047adb80133c49c73bd32deebaf7570333aef4ac37430e3cf550cf84968498e"

RPROVIDES:${PN} += "libfrrospfapiclient.so.0 \
libfrrospfapiclient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfrr.so.0"

inherit rpm
