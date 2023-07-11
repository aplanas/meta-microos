SUMMARY = "Development files for golly"
DESCRIPTION = "This package contains header files and libraries needed to develop applications \
that use golly."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "golly-devel-4.2-2.2.aarch64.rpm"
RPM_HASH = "b146992276067cdf1e47bc6ae9a40b01d9716d50dc94a75fc7c826af7bc6464b6799d76950ce9ed72dde8cc488d4a344a857ab99a5097d7a92c58c06f91a81f9"

RPROVIDES:${PN} += "golly-devel"

RDEPENDS:${PN} += "golly"

inherit rpm
