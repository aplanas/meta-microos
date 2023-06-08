SUMMARY = "Tetum (Tetun) Dictionary for Aspell"
DESCRIPTION = "A Tetum (Tetun) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "aspell-tet-0.1.1-2.14.aarch64.rpm"
RPM_HASH = "ab8eb406b9642b7b6387dd0f52bb9c362868afa86b9e51d42d119c680c6b7466c737b37e9b5ce62615a9f2704bed94fb705b01acaf51f8faed2b566813d621fb"

RPROVIDES:${PN} += "aspell-tet aspell-tet(aarch-64) locale(aspell:tet)"
RDEPENDS:${PN} += ""

inherit rpm
