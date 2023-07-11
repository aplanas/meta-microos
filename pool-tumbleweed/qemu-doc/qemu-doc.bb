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

PV = "8.0.2"

RPM_NAME = "qemu-doc-8.0.2-2.1.noarch.rpm"
RPM_HASH = "3876b260d5ef075f2b8e0b39cb28a2bd863917b17914961d68cd5e98c4679665e64eee26792c8591d23210408fe834b3e915e9975017f600da17d3440faea9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-doc"

RDEPENDS:${PN} += ""

inherit rpm
