SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "perf-rebuild-6.4.2-80.9.aarch64.rpm"
RPM_HASH = "18725e016f2e461ed7c075fe84ddb08d9fa85d3cba909176c7034de148b982613ebfdb21975d6585abc1308caccb9adb4f1504fca61503dfcdcd70a274095a96"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
