SUMMARY = "Amharic (አማርኛ) Dictionary for Aspell"
DESCRIPTION = "An Amharic (አማርኛ) dictionary for the aspell spell checker."
LICENSE = "SUSE-Public-Domain"

PV = "0.03.1"

RPM_NAME = "aspell-am-0.03.1-2.14.aarch64.rpm"
RPM_HASH = "f41ff0213778a57107650ebe31ef284420456e11611a417ee7bab8c430c63bbc88a01a49287716cc8b8bf4ec3d802de54a21b807853006e98738943917c5f68f"

RPROVIDES:${PN} += "aspell-am \
aspell-am(aarch-64) \
locale(aspell:am)"

RDEPENDS:${PN} += ""

inherit rpm
