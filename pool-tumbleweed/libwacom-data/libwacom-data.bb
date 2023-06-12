SUMMARY = "Library to identify wacom tablets -- Data Files"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-data-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "043aec3017d786a4b2313313784652ccd39ead391bca25e560e2ace60927a19032a7fe18145a2f968c5658a373d33ee2ab8d2409895dfb0f69a27cb90ba7b133"

RPROVIDES:${PN} += "libwacom-data \
libwacom-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
