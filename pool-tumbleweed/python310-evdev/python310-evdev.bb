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

RPM_NAME = "python310-evdev-1.6.1-1.6.aarch64.rpm"
RPM_HASH = "622a769d6ce5902089b17f84223d47ef60c22b845b7d628e66c1a2548744e76cce55c5f340bfacace5a66b98f5bdf8a99f1e90ece7ab5ca5c4d3fbc0965cbeeb"

RPROVIDES:${PN} += "python3.10dist-evdev \
python310-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
