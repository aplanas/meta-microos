SUMMARY = "GNU Aspell - Spell compatibility"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains a spell script for compatibility reasons so that programs \
that expect the 'spell' command will work correctly."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-spell-0.60.8-5.4.aarch64.rpm"
RPM_HASH = "58b79ea9cc732a12222a4efccad67f316ddff7daa6d2ca8fd01b723cc57a702621b3d07815341bed96e182c0b469b16e2904f3af23a39a83e9b43a1d9369f0bf"

RPROVIDES:${PN} += "aspell-spell \
spell"

RDEPENDS:${PN} += "aspell"

inherit rpm
