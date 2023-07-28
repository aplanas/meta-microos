SUMMARY = "Documentation for QEMU"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package contains user and developer documentation for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-doc-8.0.3-1.1.noarch.rpm"
RPM_HASH = "5f24d5458c2bc2853c340b0884e31d9dc6d99744999fe85409ebe6e574816159a046d00f44131b25d62d8fea349f3502faa8daf3a1a3cadd91693e780eed6998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-doc"

RDEPENDS:${PN} += ""

inherit rpm
