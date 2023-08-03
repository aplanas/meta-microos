SUMMARY = "UEFI Secure Boot Certificate For Package gasket-driver-kmp"
DESCRIPTION = "This package contains the UEFI Secure Boot certificate used to sign \
modules in the gasket-driver-kmp packages."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-ueficert-1.0.18-2.2.aarch64.rpm"
RPM_HASH = "e23730f9df78c7d02bdb9f3ebc3569c87ca3424640274ae9cb88c36426f030eb0835517cbfa3b21cc5861a3c1e243da33636dfe03d89f1cfd7570464af4d4295"

RPROVIDES:${PN} += "gasket-driver-ueficert"

RDEPENDS:${PN} += "/usr/bin/sh \
suse-kernel-rpm-scriptlets"

inherit rpm
