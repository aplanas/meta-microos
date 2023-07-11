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

RPM_NAME = "python39-evdev-1.6.1-1.6.aarch64.rpm"
RPM_HASH = "d9f3880e6f60da28f3993f02ab7bcac087ceae7bce0249f17eb850899cb6b6877f516fe67b1bf9495e9961731d9033b60847601da27745576142ade18deff2b4"

RPROVIDES:${PN} += "python3.9dist-evdev \
python39-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
