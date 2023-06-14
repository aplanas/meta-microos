SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.67.1"

RPM_NAME = "cargo1.67-1.67.1-2.1.aarch64.rpm"
RPM_HASH = "f68bda852ac44ffe31ba1706fb48fdbc28d8d9067ebd9fff8e3950bbe265e433ef06f8fad28352ccab647b90cefe778d8245a43a35c0226435e3ee3718a4bf7f"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.67 \
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
