SUMMARY = "Turkish (Türkçe) Dictionary for Aspell"
DESCRIPTION = "A Turkish (Türkçe) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-tr-0.50-2.14.aarch64.rpm"
RPM_HASH = "3b63548f4dd05aa2e074d298449ae8163c105cc2825652a9b5cf90b07abf9b4c0324cdb6ddfbedfb0d6581f23574393923467bc8c834fe2bd3d31d19a0dab89f"

RPROVIDES:${PN} += "aspell-tr aspell-tr(aarch-64) locale(aspell:tr)"
RDEPENDS:${PN} += ""

inherit rpm
