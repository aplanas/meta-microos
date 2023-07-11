SUMMARY = "A GObject-based library to parse playlist formats"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "totem-pl-parser-3.26.6-2.9.aarch64.rpm"
RPM_HASH = "a85e5726eac239a611aeafabb17b141fcca5250f34c44deac07f273842560b2f6cfa6b9ab2256a49344d6b558075a54ec5facad7a15819b852f38261cd77368c"

RPROVIDES:${PN} += "totem-pl-parser"

RDEPENDS:${PN} += ""

inherit rpm
