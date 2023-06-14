SUMMARY = "Development files for libbraille"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille-devel-0.19.0-24.9.aarch64.rpm"
RPM_HASH = "9339806ad828d86e6465cf2d1509a0c58b3de1a75a7e5c6262c7893a1c9a2cc2f074bd065e77a615b0133ac6ef726ad4bf87cb54b3579fa751d7d19f84254f6f"

RPROVIDES:${PN} += "libbraille-devel"

RDEPENDS:${PN} += "libbraille"

inherit rpm
