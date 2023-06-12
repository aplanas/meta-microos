SUMMARY = "Python bindings to the Linux input handling subsystem"
DESCRIPTION = "python-evdev provides bindings to the generic input event interface \
in Linux. The evdev interface serves the purpose of passing events \
generated in the kernel directly to userspace through character \
devices that are typically located in /dev/input/. \
 \
This package also comes with bindings to uinput, the userspace input \
subsystem. Uinput allows userspace programs to create and handle \
input devices that can inject events directly into the input \
subsystem."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python310-evdev-1.6.1-1.4.aarch64.rpm"
RPM_HASH = "5307a260d60d8b8efc6e15de2abb29a092a416ca1f5d79e213f7a634b71417c782556d2b4a5bd46380afad7f972841433e043fde7a58806eef9a0a86211e8d30"

RPROVIDES:${PN} += "python3-evdev \
python3.10dist(evdev) \
python310-evdev \
python310-evdev(aarch-64) \
python3dist(evdev)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
