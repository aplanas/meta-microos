SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "delayacct-utils-rebuild-6.4.12-31.68.aarch64.rpm"
RPM_HASH = "7e1c6920ee7da1be2e1c105c12b5d8f7e3b5a3f66b2876706ddc8f22e95ac5239e2e55edcf392d293a49441ebbc23c391dbd7a535dc9f9c25fefd7d0be5bf9da"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
