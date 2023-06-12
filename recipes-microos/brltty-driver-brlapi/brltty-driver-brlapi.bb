SUMMARY = "BrlAPI driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the BrlAPI braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-brlapi-6.5-2.4.aarch64.rpm"
RPM_HASH = "8bfcd6b07104ed88293ea0b6154a6be2c80e19ba43af84dce59443fb7210fe57f1e29f1f7ca74abc814f07a60a953b469141111975444db854a68ac385ab3389"

RPROVIDES:${PN} += "brltty-driver-brlapi \
brltty-driver-brlapi(aarch-64) \
libbrlttybba.so()(64bit)"
RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrlapi.so.0.8()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
