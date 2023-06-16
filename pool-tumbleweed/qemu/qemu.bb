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

RPM_NAME = "qemu-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "8fb56aa95c17b6f8f1de1685109671df2d92143d31967def9a8b9136492f362a26ab184786c648aeb28707e38ae227ac62f0adb6f118b9286933faea09b70116"

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
