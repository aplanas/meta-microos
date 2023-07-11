SUMMARY = "Fast ping check"
DESCRIPTION = "This plugin will use the fping command to ping the specified host for \
a fast check. Note that it is necessary to set the suid flag on fping."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-fping-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "a93d7f5f9a1df7c6627f6313f576f8f054c6d40f993f9cf40ffe5ce3f56f1915acba194aaefee31152ba5bc3df345b8338fca7295535e472bfc1fa619ad18c9e"

RPROVIDES:${PN} += "monitoring-plugins-fping \
nagios-plugins-fping"

RDEPENDS:${PN} += "fping \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
