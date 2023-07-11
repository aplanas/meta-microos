SUMMARY = "GUI monitor for distcc server/client"
DESCRIPTION = "distcc is a program to distribute builds of C, C++, Objective C or \
Objective C++ code across several machines on a network, thereby \
completing the task in less time. distcc should always generate the \
same results as a local build."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-gui-3.4-5.5.aarch64.rpm"
RPM_HASH = "d819da72ff57550dc2560e1db99d7e7df9fed26e8c1bafe54b85c95b2be4a958a0657ee1f14ae0267afcc289fe7e2280d0c0eec6196d823969fb44d83e590499"

RPROVIDES:${PN} += "distcc-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
