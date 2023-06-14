SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.69.0"

RPM_NAME = "cargo1.69-1.69.0-2.1.aarch64.rpm"
RPM_HASH = "19ac1b01296199442d75a5eca102f3e214afc3aa028614fdb04712b10fc81975bda8cad040b4797265b535a182da1ce9fe5f0ea05a3a7e0bc5f3627e481a4b1b"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.69 \
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
