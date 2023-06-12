SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "delayacct-utils-rebuild-6.3.4-31.57.aarch64.rpm"
RPM_HASH = "3920293f6dd1e99f8eb338a8c45cb2454435539f29133a4b1b9fd42fc201afe69e33a5ff8e56af1e273401daadee17834b584fe85657275d688f177f3bb3c662"

RPROVIDES:${PN} += "delayacct-utils-rebuild delayacct-utils-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
