SUMMARY = "Machine emulator and virtualizer"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package acts as an umbrella package to the other QEMU sub-packages."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "9dd661352e86576269621221f08609ff1301a1ed37044186b8ed57d550101eaa7b80017d67df5a3e525eb289930298f196ac28d15bf773528133f848b62deb4c"

RPROVIDES:${PN} += "qemu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
acl \
coreutils \
group-kvm \
group-qemu \
qemu-arm \
udev \
user-qemu"

inherit rpm
