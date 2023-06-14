SUMMARY = "Hungarian (magyar) Dictionary for Aspell"
DESCRIPTION = "A Hungarian (magyar) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4.2"

RPM_NAME = "aspell-hu-0.99.4.2-2.14.aarch64.rpm"
RPM_HASH = "e14299d3cc6e8edf3485ad148980b9080213c4a75488d3318996eadbf41c56ed2eeb861642e760db1b082090f5de53b532f9073715ceabce99e88b733be40740"

RPROVIDES:${PN} += "aspell-hu \
locale-aspell-hu"

RDEPENDS:${PN} += ""

inherit rpm
