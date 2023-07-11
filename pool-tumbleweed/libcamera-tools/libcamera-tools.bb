SUMMARY = "Command-line utilities from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
'cam' is a command-line utility to interact with cameras. The initial state is \
limited and only supports listing cameras in the system and selecting a camera \
to interact with."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera-tools-0.0.4-2.5.aarch64.rpm"
RPM_HASH = "2f9dcba3990c8c94e6c66209605f64876ea3061ec690139af8931948fa063156fb7b607907f97ada2b8a86dd9eee582110eed360f28d0b6ed657f3d1fdf3befe"

RPROVIDES:${PN} += "libcamera-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcamera-base.so.0.0.4 \
libcamera.so.0.0.4 \
libdrm.so.2 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6 \
libyaml-0.so.2"

inherit rpm
