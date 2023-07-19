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

RPM_NAME = "python39-evdev-1.6.1-2.1.aarch64.rpm"
RPM_HASH = "2bee4c867dda072bfe9cb33dd81afeaf757ba3e73899a7e88c8ffa21da9fe62b7a7ce49cd0e94f8e8e74c22818dc59abdb8f22957b019e6aa13fa32d9c20692d"

RPROVIDES:${PN} += "python3.9dist-evdev \
python39-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
