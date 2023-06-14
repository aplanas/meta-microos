SUMMARY = "Utility that reports status information for all installed OpenCL ICDs"
DESCRIPTION = "A simple OpenCL application that enumerates all possible platform and \
device properties. Inspired by AMD's program of the same name, it is \
coded in pure C99 and it tries to output all possible information, \
including that provided by platform-specific extensions, and not to \
crash on platform-unsupported properties (e.g. 1.2 properties on 1.1 \
platforms)."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.23.01.25"

RPM_NAME = "clinfo-3.0.23.01.25-1.2.aarch64.rpm"
RPM_HASH = "fe224a495d0aed0a70a46fafc75edf528064e9a80c503c97d351ebdd5f2c434ef55f567b822cc27b9bf07eaf25844d007419d727d3db2dce82614251c9c7e7f9"

RPROVIDES:${PN} += "clinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6"

inherit rpm
