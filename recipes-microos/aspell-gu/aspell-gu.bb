SUMMARY = "Gujarati (ગુજરાતી) Dictionary for Aspell"
DESCRIPTION = "A Gujarati (ગુજરાતી) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.03"

RPM_NAME = "aspell-gu-0.03-2.14.aarch64.rpm"
RPM_HASH = "605e30ffd45c8434e93d2057ec42cf449226928859ba32fa91b0baf2e375958e668cd922845f22fa6dfa55de5a044c25ab47d50af1719e1cda4a529f54d2df0f"

RPROVIDES:${PN} += "aspell-gu aspell-gu(aarch-64) locale(aspell:gu)"
RDEPENDS:${PN} += ""

inherit rpm
