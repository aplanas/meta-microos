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

RPM_NAME = "python39-evdev-1.6.1-1.4.aarch64.rpm"
RPM_HASH = "a1afa9ed9f4c0cdf8f8b81c0c91700605ea593c86df13f7e01ad2cb1f93aa56d6efdb37b08032ee98b1187844f9c84edad92b62da9fba8c971d5aa9b18c9d606"

RPROVIDES:${PN} += "python3.9dist-evdev \
python39-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
