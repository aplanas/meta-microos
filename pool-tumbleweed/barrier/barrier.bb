SUMMARY = "Mouse, keyboard and clipboard sharing utility"
DESCRIPTION = "Barrier lets you easily share a single mouse and keyboard between \
multiple computers with different operating systems, each with its own \
display, without special hardware.  It's intended for users with \
multiple computers on their desk since each system uses its own \
display. \
 \
Redirecting the mouse and keyboard is as simple as moving the mouse off \
the edge of your screen.  Barrier also merges the clipboards of all the \
systems into one, allowing cut-and-paste between systems. Furthermore, \
it synchronizes screen savers so they all start and stop together and, \
if screen locking is enabled, only one screen requires a password to \
unlock them all."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.4.0"

RPM_NAME = "barrier-2.4.0-2.1.aarch64.rpm"
RPM_HASH = "f273b4a162bb2b01a04d478e7b2533d287901fac4e053d442f23f217e2da912440a3d398f9875a5c10053b9030e6f3ca34604aa46a3cf443c19551a8f08093e3"

RPROVIDES:${PN} += "application() \
application(barrier.desktop) \
barrier \
barrier(aarch-64) \
config(barrier)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdns_sd.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
