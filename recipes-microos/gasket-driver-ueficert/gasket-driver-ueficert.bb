SUMMARY = "UEFI Secure Boot Certificate For Package gasket-driver-kmp"
DESCRIPTION = "This package contains the UEFI Secure Boot certificate used to sign \
modules in the gasket-driver-kmp packages."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-ueficert-1.0.18-1.3.aarch64.rpm"
RPM_HASH = "61fcfe13a85cc1879fff0fe401d25e753933947a4036944924289d5f12727e77f3d4785a6e36bea95b88c2d1cd5fefffab6c8370b153960a32f5be7dbae25ac6"

RPROVIDES:${PN} += "gasket-driver-ueficert gasket-driver-ueficert(aarch-64)"
RDEPENDS:${PN} += "/bin/sh suse-kernel-rpm-scriptlets"

inherit rpm
