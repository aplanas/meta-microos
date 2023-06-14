SUMMARY = "Danish (dansk) Dictionary for Aspell"
DESCRIPTION = "A Danish (dansk) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.20"

RPM_NAME = "aspell-da-1.6.20-2.14.aarch64.rpm"
RPM_HASH = "8cddb1d9e1532ca588cb9769ae81241a2be71697716f8b370e5fc82fbf818541a66472057837c055770d42a6827c73392adb665672b30746085ca5a9d19aaacf"

RPROVIDES:${PN} += "aspell-da \
locale-aspell-da"

RDEPENDS:${PN} += ""

inherit rpm
