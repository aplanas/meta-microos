SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the header and source files needed for development with \
ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-devel-2.2.3-1.10.aarch64.rpm"
RPM_HASH = "3dcd6a5a6d4b710051dd1cc95723d376872994d1ca4aa6599ca25ab6d63697142e7d8afff25d21571d02528dc39231f2470fc34980c4b35d9d71f3f31812664c"

RPROVIDES:${PN} += "ThePEG-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ThePEG-libs \
ld-linux-aarch64.so.1 \
libThePEG.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
