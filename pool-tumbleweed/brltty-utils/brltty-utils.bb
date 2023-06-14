SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contain various utilities related to BRLTTY."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-utils-6.5-2.4.aarch64.rpm"
RPM_HASH = "e2c6991239a2d59efb8ef78f91b339813976dba4ea7f49f4ffca8d0d47bb0dda5831029721da07276b31d795ea6116a5ba60a7bd84c5c2de5a750ef305855233"

RPROVIDES:${PN} += "brltty-utils"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
