SUMMARY = "Libbraille driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the libbraille braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-libbraille-6.5-2.4.aarch64.rpm"
RPM_HASH = "f40fe5c71c184785390475e7db6d8b8a3cc0c098a8cc3c644aa37f91e6dbcea0b47c96585c5aa1c2087c288cb4ec62107b736549816401acaae1734528f52ee6"

RPROVIDES:${PN} += "brltty-driver-libbraille \
brltty-driver-libbraille(aarch-64) \
libbrlttyblb.so()(64bit)"
RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbraille-0.so.14()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
