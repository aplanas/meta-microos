SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "cpupower-rebuild-6.4.12-4.23.aarch64.rpm"
RPM_HASH = "87353ee91d4e931b763ffb2806b0f678d82534e1d3293b67044b8dcfeb9e2c9dfa4cd1e15a2a6cba8c4609a1b21e3a64f1c26f60181ca93f355d70a51b04b8c2"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
