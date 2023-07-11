SUMMARY = "A small, easy to use editor"
DESCRIPTION = "Pico is a simple, display-oriented text editor based on the Pine \
message system composer. As with Pine, commands are displayed at the \
bottom of the screen, and context-sensitive help is provided. \
Characters are inserted into the text as they are typed."
LICENSE = "Apache-2.0"

PV = "5.09"

RPM_NAME = "pico-5.09-27.5.aarch64.rpm"
RPM_HASH = "ea818096bfb38e55713cdc576474ceb6ece804646b18e202759df5e17073903d297d085dac967703324ce2b2609e236aaf07e8e54faebcee22b88922dc8f24b8"

RPROVIDES:${PN} += "pico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
