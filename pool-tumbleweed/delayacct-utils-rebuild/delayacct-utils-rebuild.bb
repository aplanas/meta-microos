SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "delayacct-utils-rebuild-6.3.9-31.60.aarch64.rpm"
RPM_HASH = "2cf42f15a91795698192c741870a1391052a7dad7525210fedffb2818d48b9814eefdaebfef975634ed06655a5eb519ac7eb19c09a75ffee1e7adf5c796df1fd"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
