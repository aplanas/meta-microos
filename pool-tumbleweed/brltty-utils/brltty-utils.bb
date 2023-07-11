SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contain various utilities related to BRLTTY."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-utils-6.5-3.1.aarch64.rpm"
RPM_HASH = "aa4f0056a6278710d813efdbe74e0417c5e3e0b55c85e87966223fd151e04f71f80912657ec70869c1ca12d58c0b0dfc4685a5834356a858326efb597022f47f"

RPROVIDES:${PN} += "brltty-utils"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
