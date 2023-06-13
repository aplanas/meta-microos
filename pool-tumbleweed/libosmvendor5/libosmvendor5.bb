SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libosmvendor5-3.3.24-3.7.aarch64.rpm"
RPM_HASH = "e4ce8549779e5436c6a97a6503a5b0581e6415e80caeb1f640d91f53faf288079e9b3747c45c9b29a6a6a087150544f096933e656550c0406b9736d898b4f1cf"

RPROVIDES:${PN} += "libosmvendor.so.5()(64bit) \
libosmvendor5 \
libosmvendor5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibumad.so.3()(64bit) \
libopensm.so.9()(64bit) \
libosmcomp.so.5()(64bit)"

inherit rpm
