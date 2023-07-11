SUMMARY = "Common files for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains the common files needed by the library."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-common-6.2.0-1.8.aarch64.rpm"
RPM_HASH = "72b66a820dd0e251902df019c1c7bb004621aece25fccfac551b455af4dea99e11e9c2e1fb0f6b80000653abed83d1137693b9575ffabc25a545401e9d58605e"

RPROVIDES:${PN} += "granite-common"

RDEPENDS:${PN} += ""

inherit rpm
