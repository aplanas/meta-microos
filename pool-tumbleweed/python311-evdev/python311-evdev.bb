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

RPM_NAME = "python311-evdev-1.6.1-1.6.aarch64.rpm"
RPM_HASH = "65d6474811c82135ffcf3b4550bc1d247e04d11143e35db089008db884ff21a9c74702730c9e7205d36fdc2bd26a67f99a2c647f1ed5ea8642c9d16c87ee98ac"

RPROVIDES:${PN} += "python3-evdev \
python3.11dist-evdev \
python311-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
