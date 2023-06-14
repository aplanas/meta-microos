SUMMARY = "Turkmen (Türkmençe) Dictionary for Aspell"
DESCRIPTION = "A Turkmen (Türkmençe) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-tk-0.01-2.14.aarch64.rpm"
RPM_HASH = "4334db14546522b6eaa5f98623a57361250d6fd0e6550b542596abfc23c7cbe5c1172e3692ca4e6fb07c78967c524c8af1a9f740ca5562df41b14ec7a8b17ecd"

RPROVIDES:${PN} += "aspell-tk \
locale-aspell-tk"

RDEPENDS:${PN} += ""

inherit rpm
