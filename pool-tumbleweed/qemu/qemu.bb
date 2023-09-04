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

PV = "8.0.4"

RPM_NAME = "qemu-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "0254255bb09f26c3a26f4ed995d9ff472bf6b6e1a2c22feb7f3b8a66bd18569a2235e29dd19c1d9207844a56c934cfb1c30460ccb261a8cb463bc0b8056207c6"

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
