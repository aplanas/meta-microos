SUMMARY = "Device-tree compiler"
DESCRIPTION = "PowerPC kernels are moving towards requiring a small Open \
Firmware-style device tree as the only means of passing information \
from bootloaders/firmware to the kernel. This does not require a full \
Open Firmware implementation. DTC (Device Tree Compiler) is a tool to \
create a static device tree, which is adequate for most embedded \
systems (since their topology will not vary across reboots). DTC is \
available via a git tree: git://ozlabs.org/srv/projects/dtc/dtc.git"
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "dtc-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "848be69786a312f7e538b460464fee3c905f4bcd3b71d176f17ac82e701e6c1d7615ef7db8cdbe4963b2a0868598e1b1f49d4426be8d16c1b15f71ccc0757d4c"

RPROVIDES:${PN} += "dtc \
dtc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfdt.so.1()(64bit) \
libfdt.so.1(LIBFDT_1.2)(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
