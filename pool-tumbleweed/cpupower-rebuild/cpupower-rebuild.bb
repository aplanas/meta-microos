SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "cpupower-rebuild-6.3.4-4.12.aarch64.rpm"
RPM_HASH = "ae01a81141963b39763da4bb3f2232491b9907e187272fce8b3618aa7b2d775f8934f61513989971debcd6057d31d1fea1f36a376bfcdea7b8c6ccc09afc35e4"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
