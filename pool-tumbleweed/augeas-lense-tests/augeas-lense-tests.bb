SUMMARY = "Set of tests for official Augeas lenses"
DESCRIPTION = "Set of tests for official Augeas lenses. These can be used when \
modifying the official lenses, or when creating new ones."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-lense-tests-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "f3e9270023b944eb17568c1c6104c914f33acec46ffddc20be7213a351a35c9e687451336451e44fc588f80c350cf5135034100e2dcb6176ca7038de2069dd73"

RPROVIDES:${PN} += "augeas-lense-tests"

RDEPENDS:${PN} += "augeas-lenses"

inherit rpm
