SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contain various utilities related to BRLTTY."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-utils-6.5-2.3.aarch64.rpm"
RPM_HASH = "67e5de2ad5ecd98589ae1edc76e54560eaea436663842cf953a8e7e0ce41d994237a4a7f9aa10b569b402ba2493e900c7da2edf7a1e59b96a8f20d76ac35405d"

RPROVIDES:${PN} += "brltty-utils brltty-utils(aarch-64)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
