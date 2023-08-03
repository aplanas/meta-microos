SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "cpupower-rebuild-6.4.6-4.19.aarch64.rpm"
RPM_HASH = "47bb85e2beb1fdc7138ef9fc44a921ec7f233a9d45a3a23cc325c32cc1c8cc2c719c5f64aaaae57b4d8b168996b548e662e4023ee00e8c525ef30022b3222101"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
