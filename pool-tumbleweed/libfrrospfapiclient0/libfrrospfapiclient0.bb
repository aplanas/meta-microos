SUMMARY = "API for FRRouting's OSPFv2 implementation"
DESCRIPTION = "This library contains part of the OSPFv2 implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrospfapiclient0-8.4-4.1.aarch64.rpm"
RPM_HASH = "4f681cad6e63704ab13c7aaa79d8c22f279fbd03eae7e34fa9e2909ae3dbb56b223cd24a2846eba4141c7d5dfea2a3966904481a72ea809c5297c06594de4e38"

RPROVIDES:${PN} += "libfrrospfapiclient.so.0()(64bit) \
libfrrospfapiclient0 \
libfrrospfapiclient0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libfrr.so.0()(64bit)"

inherit rpm
