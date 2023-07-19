SUMMARY = "The Table engine for IBus platform"
DESCRIPTION = "The package contains general Table engine for IBus platform."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.1"

RPM_NAME = "ibus-table-1.17.1-1.1.aarch64.rpm"
RPM_HASH = "8a447211325acc1e1a320808bda30e82cbfa8113649ce8d42d89db820c8dd8d3bc4a3e68ad45785603dbe8214b16422d67385b22ee81f26f72e61f3be5610f17"

RPROVIDES:${PN} += "ibus-table"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
python3 \
python3-curses"

inherit rpm
