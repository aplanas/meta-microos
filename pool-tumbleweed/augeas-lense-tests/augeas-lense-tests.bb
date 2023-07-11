SUMMARY = "Set of tests for official Augeas lenses"
DESCRIPTION = "Set of tests for official Augeas lenses. These can be used when \
modifying the official lenses, or when creating new ones."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-lense-tests-1.13.0-2.2.aarch64.rpm"
RPM_HASH = "2348e4ba1e6b92bf37085728866eb5d17adba90e25d78c4660f094e7f920899efadb50483ad85667b7c9c5663ff73178bd41ac57af8afec89fdbfc308f3f3958"

RPROVIDES:${PN} += "augeas-lense-tests"

RDEPENDS:${PN} += "augeas-lenses"

inherit rpm
