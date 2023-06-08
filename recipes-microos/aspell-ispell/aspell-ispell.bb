SUMMARY = "GNU Aspell - Ispell compatibility"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains an ispell script for compatibility reasons so that \
programs that expect the 'ispell' command will work correctly."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-ispell-0.60.8-5.4.aarch64.rpm"
RPM_HASH = "159868beb03e50408894f45c0686be923c54776e8e38834a8fcd28c4044b6670ad0f64925be217a517ef125ea6ca4ee6872d149c4a81bc595df93dad16473904"

RPROVIDES:${PN} += "aspell-ispell aspell-ispell(aarch-64)"
RDEPENDS:${PN} += "aspell"

inherit rpm
