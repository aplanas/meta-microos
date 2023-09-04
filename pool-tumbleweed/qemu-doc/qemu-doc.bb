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

PV = "8.0.4"

RPM_NAME = "qemu-doc-8.0.4-1.1.noarch.rpm"
RPM_HASH = "afa55f4a23ff88197f273fcb8c33caee7b492e387649142989b0dcaf7a86dda14c92bc752fe678daea919b8f5d50e8dae6a9dba05e8bfbb7038ff695c52b16a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-doc"

RDEPENDS:${PN} += ""

inherit rpm
