SUMMARY = "A PDF library extracted from TeX's dvipdfmx"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the shared library for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.10"

RPM_NAME = "libtexpdf0-0.14.10-1.1.aarch64.rpm"
RPM_HASH = "4710d4e2ce3d5865045e81922dca81c62099bda9da2fef054c3671939612fb73ace7e54fd3340338e3e2e1f1de901a7fbc69d490dbb6f67951ca1311245c82f4"

RPROVIDES:${PN} += "libtexpdf.so.0 \
libtexpdf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
