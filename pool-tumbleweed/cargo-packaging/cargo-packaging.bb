SUMMARY = "Macros and tools to assist with cargo and rust packaging"
DESCRIPTION = "A set of macros and tools to assist with cargo and rust packaging, written in a manner \
that follows upstream rust's best practices."
LICENSE = "MPL-2.0"

PV = "1.2.0+3"

RPM_NAME = "cargo-packaging-1.2.0+3-1.1.aarch64.rpm"
RPM_HASH = "f152224049cb969c5dd47a4d2327b3995ee151111c7861222ac23588e7cc25ee1fc5ebe43b33ff60571e3af4a28846cfeaff369ec8937b57144cba025966e654"

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
