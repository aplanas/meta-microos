SUMMARY = "Integration of uGet with Firefox"
DESCRIPTION = "Integration of the uGet Download Manager with Mozilla Firefox."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "firefox-uget-integrator-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "df99ba193b8686de4e443db286a8cc709a66f3bb1017c823ce0f3c3170c602e58c737d95cd249505f1208f31bf52b5f6e0d8e739be5122b53fa462b6dacb9bd5"

RPROVIDES:${PN} += "firefox-uget-integrator firefox-uget-integrator(aarch-64)"
RDEPENDS:${PN} += "uget-integrator"

inherit rpm
