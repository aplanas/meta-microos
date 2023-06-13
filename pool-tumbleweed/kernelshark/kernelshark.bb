SUMMARY = "Visualisation tool for trace-cmd data"
DESCRIPTION = "trace-cmd reporting can be extremely verbose making it difficult to \
analyse. kernelshark visualises the data so that it can be filtered \
or trimmed."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.2.0"

RPM_NAME = "kernelshark-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "b770168c28c841ed7802c2f3e047ae0cafe4445222fa27c8f83ee9623b30ade54653c5d82af37f80727fb48528425b24631197eb3d507c35f197a7febfd63a86"

RPROVIDES:${PN} += "application() \
application(kernelshark.desktop) \
kernelshark \
kernelshark(aarch-64) \
libkshark-gui.so.2.2.0()(64bit) \
libkshark-plot.so.2.2.0()(64bit) \
libkshark.so.2()(64bit)"

RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglut.so.3()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtracecmd.so.1()(64bit) \
libtraceevent.so.1()(64bit) \
libtracefs.so.1()(64bit)"

inherit rpm
