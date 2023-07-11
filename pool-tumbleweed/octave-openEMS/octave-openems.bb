SUMMARY = "Octave interface for openEMS"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method. \
 \
This package provides Octave interface for openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "octave-openEMS-0.0.35-5.37.aarch64.rpm"
RPM_HASH = "1c2237758f3ed1e9442922627f137036917e9a82d0e7c26fa7ff40f6c8ac7c3e2838ac2eeb0f222780ddbec16cd76bac7ba8eba4f15e2fcedcd49951bdfa60f9"

RPROVIDES:${PN} += "octave-openEMS"

RDEPENDS:${PN} += "/usr/bin/sh \
AppCSXCAD \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6 \
octave-CSXCAD \
octave-cli \
openEMS"

inherit rpm
