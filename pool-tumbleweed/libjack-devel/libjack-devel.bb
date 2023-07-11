SUMMARY = "Development package for jack"
DESCRIPTION = "This package contains the files needed to compile programs that \
communicate with jack clients/servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack-devel-1.9.22-2.2.aarch64.rpm"
RPM_HASH = "e1cf185dec4521157198e6ad8e97e9cba1d92faa509d880ce45eca691a35713a547c9594204f8f4bee5efbaac893cd88ffefd229189cf9e432e3926d605d0192"

RPROVIDES:${PN} += "jack-audio-connection-kit-devel \
jack-devel \
libjack-devel \
libjack2-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjack0 \
libjacknet0 \
libjackserver0 \
pkgconfig"

inherit rpm
