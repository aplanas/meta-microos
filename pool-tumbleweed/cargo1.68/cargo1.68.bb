SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.68.2"

RPM_NAME = "cargo1.68-1.68.2-2.3.aarch64.rpm"
RPM_HASH = "1f510a0712d3765c70fc649929e18b52f2517d1c244105a6ff7acee580f08ba4bc5d5cf0dbbc4fb21969bc7de996de7180181704ed38ecc604a005c94557420c"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.68 \
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
