SUMMARY = "Freepascal Compiler documentation"
DESCRIPTION = "The fpc-doc package contains the documentation PDF files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-doc-3.2.2-3.9.aarch64.rpm"
RPM_HASH = "b4cb071bb17dad766d169e3187b5a64787b903d0246a2f98859dd8e8af18cc2034d476045577882f3b33662b7cf843f70be06eb511c001cbad4274bad7fcf659"

RPROVIDES:${PN} += "fpc-doc"

RDEPENDS:${PN} += "binutils"

inherit rpm
