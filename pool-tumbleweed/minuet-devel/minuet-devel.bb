SUMMARY = "Minuet: Build Environment"
DESCRIPTION = "Development headers and libraries for Minuet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "minuet-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "abbb14647557cf1c408e637e5e5f068e374edc34c74f7c4401fd69d45d5eee5729ce6b264746b120850f2b86cf6c357285e58a61ecd4105cf8af97043ce4591d"

RPROVIDES:${PN} += "minuet-devel \
minuet-devel(aarch-64)"

RDEPENDS:${PN} += "minuet"

inherit rpm
