SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "MIT & GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "babeltrace2-devel-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "3e57f0b1fa5e4fe5ddbb88d57f85502de688bc31a2bb229d497ac0f7e57e8a7d968150d509230fe1a121100abf1433318d6107befaa1b16f254c5dfaf367a28f"

RPROVIDES:${PN} += "babeltrace2-devel babeltrace2-devel(aarch-64) pkgconfig(babeltrace2) pkgconfig(babeltrace2-ctf-writer)"
RDEPENDS:${PN} += "/usr/bin/pkg-config babeltrace2"

inherit rpm
