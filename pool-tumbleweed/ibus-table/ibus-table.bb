SUMMARY = "The Table engine for IBus platform"
DESCRIPTION = "The package contains general Table engine for IBus platform."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.0"

RPM_NAME = "ibus-table-1.17.0-1.2.aarch64.rpm"
RPM_HASH = "b351ab891f749ef83c15e53e41d99d47b1cb8931eac0492653f7bade1dac126efc35b2d357cbd24d47377a7f199bc67e598aae762fc61f1e40a589de69e7a5be"

RPROVIDES:${PN} += "ibus-table"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
python3 \
python3-curses"

inherit rpm
