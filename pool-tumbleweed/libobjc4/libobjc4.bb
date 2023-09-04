SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libobjc4-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "b36be36b5a3f929e8ec10493e6500293c92c4626070664c9b61c1bd04f6ac42fb843818f61d3d948ed8f6b620fe7e31c447ca7d301a6c398ac04bc0edd71c5da"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
