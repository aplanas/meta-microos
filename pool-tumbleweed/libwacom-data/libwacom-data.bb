SUMMARY = "Library to identify wacom tablets -- Data Files"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-data-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "8ea76d8e65263b66300b23ebc44ee80a6cb701678b43d323f4e54ce92cf961d307256b12eb19e46f4efcff204e24054975e30294f5f9e3eaeb0131890140bb0a"

RPROVIDES:${PN} += "libwacom-data"

RDEPENDS:${PN} += ""

inherit rpm
