SUMMARY = "Interlingua Dictionary for Aspell"
DESCRIPTION = "An Interlingua dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-ia-0.50-2.14.aarch64.rpm"
RPM_HASH = "f282bcea613509590d867b7bb84ecf371fc4413d2c6e5095eb02ff56208bd9c09324548747a6081081289c96ed1f4f56077f8f7840464b5fdc31e0913cdfad95"

RPROVIDES:${PN} += "aspell-ia \
aspell-ia(aarch-64) \
locale(aspell:ia)"

RDEPENDS:${PN} += ""

inherit rpm
