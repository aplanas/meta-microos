SUMMARY = "GNU Aspell - Ispell compatibility"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains an ispell script for compatibility reasons so that \
programs that expect the 'ispell' command will work correctly."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-ispell-0.60.8-5.5.aarch64.rpm"
RPM_HASH = "3f5f12860e49fc7664e8eb27dd441750da7ff21876876266c73fa7740f514d35ba4444fe28028c912edd7cad1396e932b7e70050797dff0b17af915b2b0a39ef"

RPROVIDES:${PN} += "aspell-ispell"

RDEPENDS:${PN} += "aspell"

inherit rpm
