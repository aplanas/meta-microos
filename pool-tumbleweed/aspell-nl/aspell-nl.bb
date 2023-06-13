SUMMARY = "Dutch (Nederlands) Dictionary for Aspell"
DESCRIPTION = "A Dutch (Nederlands) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "1.00.7"

RPM_NAME = "aspell-nl-1.00.7-2.14.aarch64.rpm"
RPM_HASH = "8d66650747089030e7007ca7170fe780188487cdf6f4cab8b33d50d7a2a03c03dc133156d72bbe380569d621feb9cefe87509131627671176a2035fcb8e6821b"

RPROVIDES:${PN} += "aspell-nl \
aspell-nl(aarch-64) \
locale(aspell:nl)"

RDEPENDS:${PN} += ""

inherit rpm
