SUMMARY = "Check swap space"
DESCRIPTION = "Check swap space on local machine."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-swap-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "51fc13265b57c1046964919e1884544e28ba66ce0e866b62ecb60c994ae768a0cef89000a22ab79e43b1014dae182425dd82ad0fc1a18cee8b584a60e2308098"

RPROVIDES:${PN} += "config-monitoring-plugins-swap \
monitoring-plugins-swap \
nagios-plugins-swap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
