SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "delayacct-utils-rebuild-6.4.11-31.67.aarch64.rpm"
RPM_HASH = "1cf28f2f431e29b9683802962461ae336763b02a67cd8ca5b648f62107f0e8fc0c16d27e3e939426e0dc7f9988818220a0456714b17fd929871a92fd41074e15"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
