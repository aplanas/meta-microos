SUMMARY = "UEFI Secure Boot Certificate For Package gasket-driver-kmp"
DESCRIPTION = "This package contains the UEFI Secure Boot certificate used to sign \
modules in the gasket-driver-kmp packages."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-ueficert-1.0.18-1.7.aarch64.rpm"
RPM_HASH = "2e0964ed5b4fa24e145cd38f7298a55f91f05716ba904167a2b81d0b81fbaa413bcc5a22a9f2ae02ce11d378302f4b03242dc91667ea9be7fb490943bec4b067"

RPROVIDES:${PN} += "gasket-driver-ueficert"

RDEPENDS:${PN} += "/usr/bin/sh \
suse-kernel-rpm-scriptlets"

inherit rpm
