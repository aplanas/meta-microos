SUMMARY = "Header files for libglog0"
DESCRIPTION = "The glog library implements application-level logging. \
This library provides logging APIs based on C++-style \
streams and various helper macros. \
 \
This package provides development files for libglog0."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "glog-devel-0.5.0-1.8.aarch64.rpm"
RPM_HASH = "db4dab0940f71e92df6aa7af4731837b10a0f23b5a6039ef3e261ebacddeb0b3d5a4edd152c49c01e147ee2b3995d17c1dd5d021268b82afcbdb1bd89ddbe06b"

RPROVIDES:${PN} += "cmake(glog) \
glog-devel \
glog-devel(aarch-64) \
pkgconfig(libglog)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglog0"

inherit rpm
