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

RPM_NAME = "qemu-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "41ada644a9ae450f0dd91e3b74d73b496d0b9e7256d16bade6bd968e3c5fc9b0cf0ca43409714ed9191b7fed2416322ddc2d3276bbbda248afaf03930014b566"

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
