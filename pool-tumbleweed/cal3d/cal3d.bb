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

RPM_NAME = "cal3d-0.120-3.11.aarch64.rpm"
RPM_HASH = "d53d0d6363a2821ad8dd2f40fe01b9d97fe1f7eb068475e0e8c635d5d3747ad5892084aee03bf63f81ed6a91cbb4729df1e79e353be9322b254d3ecc3ec5c8a5"

RPROVIDES:${PN} += "cal3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcal3d.so.12 \
libcal3d12 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig"

inherit rpm
