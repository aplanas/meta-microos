SUMMARY = "Generic Spell Checking Library - Command Line Tools"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides command-line tools to interact with enchant."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-tools-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "fbb52a3c1b17fdb1396f65e63442d05a3c3ce4f227a88956d2db5c3daf46855b5601e8e17437132f9974a88a479d8fb7d5562a0440d3fe1cedfafcb0c2e118e8"

RPROVIDES:${PN} += "enchant-1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libglib-2.0.so.0"

inherit rpm
