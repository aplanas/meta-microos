SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the header and source files needed for development with \
ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-devel-2.2.3-1.9.aarch64.rpm"
RPM_HASH = "d20cfb4a5c24d8eb5631830e908fb4cf6d0142a177d804880f8f38e912356c68b4e7b3ec261f6bf26332d381c40f94d9959c3866a3173758a761af3c9c101a7f"

RPROVIDES:${PN} += "ThePEG-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ThePEG-libs \
ld-linux-aarch64.so.1 \
libThePEG.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
