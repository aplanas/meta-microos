SUMMARY = "Best Mega Pack 1+3"
DESCRIPTION = "Bestplugins Mega Pack 1+3 contains dozens of guitar sounds from famous bands."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "bestplugins-0.44.1-2.2.aarch64.rpm"
RPM_HASH = "342f0b74370f09a51ac10594eece2d340a451b3a08dc088507f6c13d86564a22ae139e684a0cbff76900357a3135fad9f7ea36edf8e510d37e9b23f0e1c57ee0"

RPROVIDES:${PN} += "bestplugins bestplugins(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
