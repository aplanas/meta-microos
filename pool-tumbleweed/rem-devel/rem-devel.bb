SUMMARY = "Librem development files"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librem."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "rem-devel-2.10.0-1.4.aarch64.rpm"
RPM_HASH = "7eafda34dda5cc5f0552936f0fd2faa619121fdcd2633ea68d121aa05a5434a5d57855f1b8df4827c0cff3e67cfa5f56eec723b4b4f7ddfe3b3abfba17df9917"

RPROVIDES:${PN} += "pkgconfig(librem) \
rem-devel \
rem-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librem4"

inherit rpm
