SUMMARY = "INIH dynamic libary files"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the library for use at runtime by applications using INIH."
LICENSE = "BSD-3-Clause"

PV = "56"

RPM_NAME = "libinih0-56-1.4.aarch64.rpm"
RPM_HASH = "89dfec8df8cd509f8e10f57b91f0d2d7834b8e8177b07877535d3f4e095e7b78cbcc2acf576cd9f826c1adb1c8b8fbe6c5caf25ad8a183c66af403c678a25106"

RPROVIDES:${PN} += "libINIReader.so.0()(64bit) \
libinih.so.0()(64bit) \
libinih0 \
libinih0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
