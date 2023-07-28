SUMMARY = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
DESCRIPTION = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
LICENSE = "MIT"

PV = "0.6.2.2"

RPM_NAME = "libcjose-devel-0.6.2.2-1.1.aarch64.rpm"
RPM_HASH = "25ec4b5ace866a2863307b86d4ef6ed3e96e94cc2abdeb1b059a26ed5fff6084c8c804c8c0acdff4f8cb8587af4d6dc237b5d91c0a6a7acbd6b06ebc6634b899"

RPROVIDES:${PN} += "libcjose-devel \
pkgconfig-cjose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcjose0 \
pkgconfig-jansson \
pkgconfig-libcrypto"

inherit rpm
