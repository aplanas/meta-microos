SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.71.1"

RPM_NAME = "cargo1.71-1.71.1-1.1.aarch64.rpm"
RPM_HASH = "c7ed07e0e660273a3717dca894a85fdc20baf198d9c8aef8b4ecd4e801a3a68e4653928ef2c2b8d91071429454fe6fbede2e8da8e087e8f58e53b15b3cf04199"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.71 \
rust+cargo"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1 \
rust-std"

inherit rpm
