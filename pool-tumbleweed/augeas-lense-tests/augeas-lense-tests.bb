SUMMARY = "Set of tests for official Augeas lenses"
DESCRIPTION = "Set of tests for official Augeas lenses. These can be used when \
modifying the official lenses, or when creating new ones."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-lense-tests-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "1183acef295cd879126f06374e754de7b2ecbdf3390f5fbbe5de3eb7a87ff6c06321f0d375214ceab9ee3b06768bc7ac7d4db23ad5d9bb28b7bece59d67967e4"

RPROVIDES:${PN} += "augeas-lense-tests"

RDEPENDS:${PN} += "augeas-lenses"

inherit rpm
