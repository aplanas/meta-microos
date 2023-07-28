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

RPM_NAME = "qemu-headless-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "de3c682f52fd2ae817d73304839ced46681fb89310a6158cdaa99ae08421d503e81f077c8563963572143e1a1a371e281135e5446f2e06e756e7e2798efadf84"

RPROVIDES:${PN} += "qemu-headless"

RDEPENDS:${PN} += "qemu \
qemu-chardev-spice \
qemu-hw-usb-redirect \
qemu-img \
qemu-ui-spice-core"

inherit rpm
