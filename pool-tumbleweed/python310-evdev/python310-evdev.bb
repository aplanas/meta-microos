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

RPM_NAME = "python310-evdev-1.6.1-2.1.aarch64.rpm"
RPM_HASH = "3ea2bd1567c57df927a52fe1b82bccac27e781e80f9ab25c402c4dc813015996ebb3409c3ee75a42c34621f9ebc61a1684c299f54dba121534c6d534e34a096b"

RPROVIDES:${PN} += "python3.10dist-evdev \
python310-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
