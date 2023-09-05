SUMMARY = "Command-line utilities from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
'cam' is a command-line utility to interact with cameras. The initial state is \
limited and only supports listing cameras in the system and selecting a camera \
to interact with."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "libcamera-tools-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "9c090d22ad0a5b32f35c8ed90c43da2d16fb7541b6af46927b89ae7d1b3b2b499a9a53d6079c9396d6ece8cc7edaf92c9138e3eeddc6897de73fd0aab897e079"

RPROVIDES:${PN} += "libcamera-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcamera-base.so.0.1 \
libcamera.so.0.1 \
libdrm.so.2 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6 \
libyaml-0.so.2"

inherit rpm
