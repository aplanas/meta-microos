SUMMARY = "Faroese (føroyskt) Dictionary for Aspell"
DESCRIPTION = "A Faroese (føroyskt) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.16"

RPM_NAME = "aspell-fo-0.2.16-2.14.aarch64.rpm"
RPM_HASH = "a1265ddb87de00bc50cff01ab51fb92103d330d9a7f151aaac7d895536f6b8a44d15a1a6ee1e65604850371dd5cd4926f1763792a48dcfd06a47a960a3a2e21a"

RPROVIDES:${PN} += "aspell-fo aspell-fo(aarch-64) locale(aspell:fo)"
RDEPENDS:${PN} += ""

inherit rpm
