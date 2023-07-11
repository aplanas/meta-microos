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

PV = "8.0.2"

RPM_NAME = "qemu-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "20ec94c77afcab02b91f0be893c6a95cbd1aa37058112e1ec79a9b24b82fa5b38afd9f0344a264e943c3493547a97034adc4f675340810e3a144e40e6559c881"

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
