SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "perf-rebuild-6.4.11-81.1.aarch64.rpm"
RPM_HASH = "f33c1b63c9d9cb142b663c298d2d356574a8cadfddf4b0e5071ed94bf4dd243f62da07bcd5982df117e80fcf2161f98a762c3609db04b1ffe570de7379c2b7af"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
