SUMMARY = "GUI monitor for distcc server/client"
DESCRIPTION = "distcc is a program to distribute builds of C, C++, Objective C or \
Objective C++ code across several machines on a network, thereby \
completing the task in less time. distcc should always generate the \
same results as a local build."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-gui-3.4-5.4.aarch64.rpm"
RPM_HASH = "62e8c41f0967b4a4c9230197c3772a9ac576627ef917cdc336c18cb6d726962814f80633278d49f4d7f9153786c1f4bfca44c2cc5242d7078f8126e5ae6c970e"

RPROVIDES:${PN} += "distcc-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
