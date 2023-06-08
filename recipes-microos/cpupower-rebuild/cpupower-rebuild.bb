SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "cpupower-rebuild-6.3.1-4.10.aarch64.rpm"
RPM_HASH = "25bbb2cee6683ec90342adfbc0cb75c10e7e786c10bd32bac88d46a3455776dd0cac352cd9dabb19893849ed9692325e16564ff43747db0d8a46e36146e448dc"

RPROVIDES:${PN} += "cpupower-rebuild cpupower-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
