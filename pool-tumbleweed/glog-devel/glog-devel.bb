SUMMARY = "Header files for libglog0"
DESCRIPTION = "The glog library implements application-level logging. \
This library provides logging APIs based on C++-style \
streams and various helper macros. \
 \
This package provides development files for libglog0."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "glog-devel-0.5.0-1.9.aarch64.rpm"
RPM_HASH = "41576da8cebbab2bb1e448295473dc637940039e8b9d3a1d17944f411a5e20331ff5662dde76e0e9261fe618ca7e3a27d9713eba2604efcb7fad000b9b0d5c9b"

RPROVIDES:${PN} += "cmake-glog \
glog-devel \
pkgconfig-libglog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglog0"

inherit rpm
