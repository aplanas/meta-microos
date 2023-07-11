SUMMARY = "Development files for bssl_wrapper"
DESCRIPTION = "bssl_wrapper is a library which translates BoringSSL calls to OpenSSL calls. \
 \
This package contains development files for bssl_wrapper."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bssl_wrapper-devel-2.0.1-1.10.aarch64.rpm"
RPM_HASH = "aead707459d5bb6ea3233bd58863a8672f7db6cc4c7eb53be7adfd1ce97c2a5fd46187d04dc2374d099eb64c04294d7570be404fa7bf45a24d6ffa0193b24215"

RPROVIDES:${PN} += "bssl-wrapper-devel"

RDEPENDS:${PN} += "libbssl-wrapper-lib0"

inherit rpm
