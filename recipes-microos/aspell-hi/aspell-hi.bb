SUMMARY = "Hindi (हिंदी) Dictionary for Aspell"
DESCRIPTION = "A Hindi (हिंदी) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-hi-0.02-2.14.aarch64.rpm"
RPM_HASH = "c59bf181ae0c999d893f7b59535d45853228e1ef93ffd393ee7df463d35fa5a15ad1dd54020a4142fdd8a8ce8fbefbb0631a85f3dbaba6725a08782a5a5329b5"

RPROVIDES:${PN} += "aspell-hi \
aspell-hi(aarch-64) \
locale(aspell:hi)"
RDEPENDS:${PN} += ""

inherit rpm
