SUMMARY = "Shared libraries for cal3d"
DESCRIPTION = "Cal3D is a skeletal based 3D character animation library written \
in C++ in a platform-/graphic API-independent way. Originally \
designed to be used in a 3D client for Worldforge, it evolved \
into a stand-alone product which can be used in many different \
kinds of projects. It supports combining animations and actions \
through a 'mixer' interface, and work is currently underway to \
integrate morph targets (interpolating between one mesh and \
another, using the same vertex sequence) easily into the system. \
 \
This package contains the shared libraries for cal3d."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "libcal3d12-0.120-3.11.aarch64.rpm"
RPM_HASH = "b81b60c241bf8252bf8e48b54955746748b9fd06907c00ed51ca88d7cbd7c571aa924d1bc1d7aa99652524be212b00de754d74c34d6a9df00b2e68fc9a86a883"

RPROVIDES:${PN} += "libcal3d.so.12 \
libcal3d12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
