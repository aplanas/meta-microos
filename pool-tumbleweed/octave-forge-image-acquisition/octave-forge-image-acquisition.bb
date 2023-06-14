SUMMARY = "Image Acquisition functions for Octave"
DESCRIPTION = "The Octave-forge Image Aquisition package provides functions to capture \
images from connected devices. Currently only v4l2 is supported. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "octave-forge-image-acquisition-0.2.2-2.1.aarch64.rpm"
RPM_HASH = "05affb2cefc2bd9995092168487293ee14e9728be6d682eb8c06d0106aaa86b6d8c2ad5b4b811333899de0299157eab14764eaf3ee4386b388e509f034d9b530"

RPROVIDES:${PN} += "octave-forge-image-acquisition"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libv4l2.so.0 \
octave-cli"

inherit rpm
