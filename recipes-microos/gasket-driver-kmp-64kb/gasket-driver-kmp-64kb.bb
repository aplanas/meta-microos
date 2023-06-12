SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.3.4_1"

RPM_NAME = "gasket-driver-kmp-64kb-1.0.18_k6.3.4_1-1.3.aarch64.rpm"
RPM_HASH = "8a9764c305cacf6d62625f4ec1d4a42db2525d03b2dfccc1d7d8cc0a7915823ad221a36958203ebed886e8f35d88931517bb2cef4e0bb1168e97a06424914b09"

RPROVIDES:${PN} += "gasket-driver-kmp gasket-driver-kmp-64kb gasket-driver-kmp-64kb(aarch-64) gasket-driver-kmp-64kb-k6.3.4_1 kmod(apex.ko) kmod(gasket.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils gasket-driver-ueficert grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
