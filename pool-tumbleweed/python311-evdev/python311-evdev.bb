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

RPM_NAME = "python311-evdev-1.6.1-2.1.aarch64.rpm"
RPM_HASH = "9e7723dd0e6852b87afd06f13dfc0e89060267b9ebc019c24cddd3ed5da5946a5258716b66e276002c08013de447ef505afa037fe22f0219e82a484bf9b39ce2"

RPROVIDES:${PN} += "python3-evdev \
python3.11dist-evdev \
python311-evdev \
python3dist-evdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
