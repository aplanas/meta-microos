SUMMARY = "Example applications for chmlib"
DESCRIPTION = "This package contains examples built on chmlib which may be useful \
to convert chm files from command line."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "chmlib-examples-0.40-24.8.aarch64.rpm"
RPM_HASH = "6a45b8fef364a1c0dd87b43a95293ff33c1dcdb97897a5b214af9e3ea803d4960a49b3817915fe0dd8144f514679a2d58f6047813dd3870971c46dbd25115679"

RPROVIDES:${PN} += "chmlib-examples \
chmlib-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libchm.so.0()(64bit) \
libchm0"

inherit rpm
