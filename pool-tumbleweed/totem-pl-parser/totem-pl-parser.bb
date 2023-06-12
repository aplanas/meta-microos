SUMMARY = "A GObject-based library to parse playlist formats"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "totem-pl-parser-3.26.6-2.8.aarch64.rpm"
RPM_HASH = "130711427a8c39a1ae608348f4560824e6bab6cfacd0aae75f4b2631677e0dd81c0632f51d32f779fb90b8a21bda6fe8dd835b33060e01770817f9922b7c5d63"

RPROVIDES:${PN} += "totem-pl-parser \
totem-pl-parser(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
