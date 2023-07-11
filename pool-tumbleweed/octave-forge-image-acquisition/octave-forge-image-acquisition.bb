SUMMARY = "Image Acquisition functions for Octave"
DESCRIPTION = "The Octave-forge Image Aquisition package provides functions to capture \
images from connected devices. Currently only v4l2 is supported. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "octave-forge-image-acquisition-0.2.2-2.2.aarch64.rpm"
RPM_HASH = "1b1bcfa91b9e558cbb6072dc912ade5553c0c9588b35c4e42b565b54a86122f0e181f8eedfaf029853894c444b183514a3434ef4829ec38f09fd4ad3eaf32de8"

RPROVIDES:${PN} += "octave-forge-image-acquisition"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libv4l2.so.0 \
octave-cli"

inherit rpm
