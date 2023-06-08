SUMMARY = "Latvian (latviešu) Dictionary for Aspell"
DESCRIPTION = "A Latvian (latviešu) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "aspell-lv-1.2.1-2.14.aarch64.rpm"
RPM_HASH = "129130dbff3fac51034be9b124008c0767f00c6050caa44b21009e8b0aa73cec583732a6e7b6fdddf99f772c5d3081ea61a7f5a7e2eb73d4d9caadf5a0560e5c"

RPROVIDES:${PN} += "aspell-lv aspell-lv(aarch-64) locale(aspell:lv)"
RDEPENDS:${PN} += ""

inherit rpm
