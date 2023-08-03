SUMMARY = "Minimum set of packages for having a functional QEMU"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This meta-package brings in, as dependencies, the minimum set of packages \
currently necessary for having a functional (headless) QEMU/KVM stack."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-headless-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "da0b75f1ef53d6196810e2b4209184db8d213c9d1c86922f1d7863d4cd5b0da35a14b690aa6c0f94b614f941572c431a108b74f3c797f10c3e032f7db6a9ed65"

RPROVIDES:${PN} += "qemu-headless"

RDEPENDS:${PN} += "qemu \
qemu-chardev-spice \
qemu-hw-usb-redirect \
qemu-img \
qemu-ui-spice-core"

inherit rpm
