SUMMARY = "Development headers the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the development files for the Access Broker & Resource \
Manager for coordinating access to TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-devel-3.0.0-2.2.aarch64.rpm"
RPM_HASH = "4def26eeb8c2fb5b35a82aa3a89855855a63f2a261fb08acde014a3dfa3ef8500243ecbd0be9769a16dc1a6386ed6a3a27a774ef37338ff30b7cb04aa1204eb0"

RPROVIDES:${PN} += "pkgconfig-tss2-tcti-tabrmd \
tpm2.0-abrmd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtss2-tcti-tabrmd0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-tss2-mu \
pkgconfig-tss2-sys \
tpm2.0-abrmd"

inherit rpm
