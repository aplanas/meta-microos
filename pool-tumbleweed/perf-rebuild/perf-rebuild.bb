SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "perf-rebuild-6.3.9-80.8.aarch64.rpm"
RPM_HASH = "a2e02e7291e4cb178f98399e63e25a507d39bfe575183cb44b3af7dcf32b8d5719d548d7f9f8d364171dc5546173e231e33bf3b703eda47ca5b14e6fb9bbe6c0"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
