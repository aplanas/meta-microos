SUMMARY = "A 3D character animation library"
DESCRIPTION = "Cal3D is a skeletal based 3D character animation library written \
in C++ in a platform-/graphic API-independent way. Originally \
designed to be used in a 3D client for Worldforge, it evolved \
into a stand-alone product which can be used in many different \
kinds of projects. It supports combining animations and actions \
through a 'mixer' interface, and work is currently underway to \
integrate morph targets (interpolating between one mesh and \
another, using the same vertex sequence) easily into the system."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "cal3d-0.120-3.10.aarch64.rpm"
RPM_HASH = "f1643f2520943836b8909dc46e1cde719aceb2b0ca2d7b260508552f8df0f5b6fd44b888de09b0857a4bb46d224930479bd7fa9b2263c3b9320c9da36f8f908b"

RPROVIDES:${PN} += "cal3d \
cal3d(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcal3d.so.12()(64bit) \
libcal3d12 \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
pkgconfig"

inherit rpm
