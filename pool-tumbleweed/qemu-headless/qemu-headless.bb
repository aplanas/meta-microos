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

PV = "8.0.2"

RPM_NAME = "qemu-headless-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "94506cf262568f92a15fff934bb439b3d4837564f878219cc3503394e33a3b903e36908dfe096a2fe41cc07614c9bb8326b3d0ce7448ee258fefb8009f44e0d9"

RPROVIDES:${PN} += "qemu-headless"

RDEPENDS:${PN} += "qemu \
qemu-chardev-spice \
qemu-hw-usb-redirect \
qemu-img \
qemu-ui-spice-core"

inherit rpm
