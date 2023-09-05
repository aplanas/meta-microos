SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libobjc4-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "bb265984adbe34bfa07164cecdb478349468de0fe44ecf116be44536905e371f657f48ee45513b63c8f03648b6026acf12d18d5b92eac971320a5531aa82b8c6"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
