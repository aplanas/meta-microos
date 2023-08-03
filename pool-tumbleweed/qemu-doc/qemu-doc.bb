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

RPM_NAME = "qemu-doc-8.0.3-2.1.noarch.rpm"
RPM_HASH = "5dd5a7d12b79bae65233d18a06a48244e2b63ab53a7d4205b35c696c9b29c74abf9ae71ac4375eb46b45927060c9ea07b3c7001a3391f89cdf0ed161535362d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-doc"

RDEPENDS:${PN} += ""

inherit rpm
