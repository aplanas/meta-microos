SUMMARY = "Random Saying"
DESCRIPTION = "Fortune displays a random text string from a set of files in a certain \
format. \
 \
This occurs each time you start a login shell. To get this feature just \
uncomment the respective lines in the user's .profile."
LICENSE = "BSD-4-Clause"

PV = "2.10.0"

RPM_NAME = "fortune-2.10.0-1.17.aarch64.rpm"
RPM_HASH = "a8f2de2f5a56183f1953773522b6ec88a5dfda5c9a7c08168d1fa64dd0435ec8a1021d2e116f5a1645564c7cbab364f76c48b1b7f0814212dbd2152e0b8a188a"

RPROVIDES:${PN} += "fortune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librecode.so.3"

inherit rpm
