SUMMARY = "Libbraille driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the libbraille braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-libbraille-6.5-2.3.aarch64.rpm"
RPM_HASH = "e32c65c290a059040a67801d92cb44dcc6a4f7d052fd55012d82384844680c6de2b472094499e6590e74aff02921808816bf403bbc774e7d9186fd2ae23793b6"

RPROVIDES:${PN} += "brltty-driver-libbraille brltty-driver-libbraille(aarch-64) libbrlttyblb.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbraille-0.so.14()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
