SUMMARY = "Instant Messenger - Development Files"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kopete-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7456e217db62f48adc6e3c9b89b97d0f0816e382e62f0ac3b228bffd22dd7a8511e930d03248ed3a64610663e6b228633e6789ab3cc3ca254886c2503feb80fd"

RPROVIDES:${PN} += "kopete-devel \
kopete-devel(aarch-64)"

RDEPENDS:${PN} += "kopete"

inherit rpm
