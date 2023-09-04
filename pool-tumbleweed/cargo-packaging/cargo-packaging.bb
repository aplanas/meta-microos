SUMMARY = "Macros and tools to assist with cargo and rust packaging"
DESCRIPTION = "A set of macros and tools to assist with cargo and rust packaging, written in a manner \
that follows upstream rust's best practices."
LICENSE = "MPL-2.0"

PV = "1.2.0+4"

RPM_NAME = "cargo-packaging-1.2.0+4-1.1.aarch64.rpm"
RPM_HASH = "a941f259fcbd2b85c0439b8c13ca4510f8b0675adb9b73021c35a3440d5edd2ee00d04233c991405945af2dda17bb0a9bf4d44c084e0bec78efbf736b591873b"

RPROVIDES:${PN} += "cargo-packaging \
rpm-macro-build-rustflags \
rpm-macro-cargo-build \
rpm-macro-cargo-install \
rpm-macro-cargo-test \
rpm-macro-rust-arches \
rpm-macro-rust-tier1-arches"

RDEPENDS:${PN} += "cargo \
cargo-auditable \
libc.so.6 \
libgcc-s.so.1 \
zstd"

inherit rpm
