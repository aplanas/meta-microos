SUMMARY = "Plymouth 'Breeze' theme"
DESCRIPTION = "This package contains the 'breeze' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0+"

PV = "5.27.6"

RPM_NAME = "plymouth-theme-breeze-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "099a290f152df8ffb60a329cb465e8c82ab31e68f01bc2e3e9d2e31431a1d6fe76c201e2fe2d5445a1430b8c3b2efdb9a4e46e153eb04ff85255f24bbc401fc3"

RPROVIDES:${PN} += "plymouth-theme-breeze"

RDEPENDS:${PN} += "plymouth-plugin-label-ft \
plymouth-scripts \
plymouth-theme-breeze-plugin-breeze"

inherit rpm
