SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "cpupower-rebuild-6.4.11-4.22.aarch64.rpm"
RPM_HASH = "40d0e2f1f2b53c61e4a1d78d4876c54e2310aa3dcb11d5781a69902e50d1b4dc488a780c4d58c5a72c22327ff31343e572eae535184f403688dc9a24bc81be7c"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
