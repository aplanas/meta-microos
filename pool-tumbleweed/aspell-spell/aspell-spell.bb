SUMMARY = "GNU Aspell - Spell compatibility"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains a spell script for compatibility reasons so that programs \
that expect the 'spell' command will work correctly."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-spell-0.60.8-5.5.aarch64.rpm"
RPM_HASH = "9c1f4cc11b3bd5665c0b53f2421ab3471d23d0e880a481b96b2cfea4e48f79eda5f6559a931af31e4374ab3a47d2874f19357e5562124aba5d473de58db2fb71"

RPROVIDES:${PN} += "aspell-spell \
spell"

RDEPENDS:${PN} += "aspell"

inherit rpm
