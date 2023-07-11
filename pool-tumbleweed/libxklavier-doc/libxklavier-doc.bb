SUMMARY = "Additional Package Documentation for libxklavier"
DESCRIPTION = "This library allows you to simplify XKB-related development."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier-doc-5.4-1.8.aarch64.rpm"
RPM_HASH = "1cabf3e0f2be9e088f6a0bf258f8903c2403bf873d0b7fe4241c36975af4ee99d2bf2c62b90b781e9fdbe30397e041fdefa924fc698666c73436e5129dc6eb61"

RPROVIDES:${PN} += "libxklavier-doc"

RDEPENDS:${PN} += "libxklavier"

inherit rpm
