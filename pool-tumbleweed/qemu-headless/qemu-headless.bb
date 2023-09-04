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

PV = "8.0.4"

RPM_NAME = "qemu-headless-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "353881626e1c231ea487a64f29ea58fa39b8f903fc9aa1008b1c33296d2cf13035db442d74ed5e6f9154e5cfa7cf1a7e04ebda6f17e9031619138d980d6c47da"

RPROVIDES:${PN} += "qemu-headless"

RDEPENDS:${PN} += "qemu \
qemu-chardev-spice \
qemu-hw-usb-redirect \
qemu-img \
qemu-ui-spice-core"

inherit rpm
