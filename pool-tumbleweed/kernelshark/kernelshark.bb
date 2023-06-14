SUMMARY = "Visualisation tool for trace-cmd data"
DESCRIPTION = "trace-cmd reporting can be extremely verbose making it difficult to \
analyse. kernelshark visualises the data so that it can be filtered \
or trimmed."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.2.0"

RPM_NAME = "kernelshark-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "b770168c28c841ed7802c2f3e047ae0cafe4445222fa27c8f83ee9623b30ade54653c5d82af37f80727fb48528425b24631197eb3d507c35f197a7febfd63a86"

RPROVIDES:${PN} += "kernelshark \
libkshark-gui.so.2.2.0 \
libkshark-plot.so.2.2.0 \
libkshark.so.2"

RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libtracecmd.so.1 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
