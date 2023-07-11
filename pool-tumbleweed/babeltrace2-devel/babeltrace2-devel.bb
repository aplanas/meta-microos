SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "MIT & GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "babeltrace2-devel-2.0.4-1.11.aarch64.rpm"
RPM_HASH = "8d7dd9cf4ef57f10617fe2e48356c10da704f419c74ea2e29429cbdc06e65727069c098e6d155730508cf4bdc674d2542204e7ab91ae011f1b5879d259330e1a"

RPROVIDES:${PN} += "babeltrace2-devel \
pkgconfig-babeltrace2 \
pkgconfig-babeltrace2-ctf-writer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
babeltrace2"

inherit rpm
