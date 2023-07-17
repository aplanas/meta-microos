SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "delayacct-utils-rebuild-6.4.2-31.61.aarch64.rpm"
RPM_HASH = "615889ec58ce49261bfc61b5241f1078257d09410b65d98f1d3a5e5c58d9b1c0e7f05d638e7eab7f780d591124d9d882147c1945d97598897757249d899bfe8e"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
