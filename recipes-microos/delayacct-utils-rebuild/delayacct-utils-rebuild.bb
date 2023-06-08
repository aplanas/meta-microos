SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "delayacct-utils-rebuild-6.3.1-31.55.aarch64.rpm"
RPM_HASH = "cb4bf8f93e09a9efeba362f973943da54ef62343348596eb4300bf697bac9eeb69c6685e1250dcf22c441dbc94df248338d792f2af183e4f5ef6d9c8c62392a3"

RPROVIDES:${PN} += "delayacct-utils-rebuild delayacct-utils-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
