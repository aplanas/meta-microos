SUMMARY = "Python binding for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "python3-gpiod-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "5babc52f9831fd659d374fca799f86037aebd4344c192a43ca114bb2fb81b6b4f8345fd29fe055a68b121869bd524840dd95ae7ab67ae9e0254e9728a609d9e8"

RPROVIDES:${PN} += "python-libgpiod \
python3-gpiod \
python3-gpiod(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgpiod.so.2()(64bit) \
libgpiomockup.so.0()(64bit) \
python(abi)"

inherit rpm
