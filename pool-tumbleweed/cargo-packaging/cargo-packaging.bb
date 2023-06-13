SUMMARY = "Macros and tools to assist with cargo and rust packaging"
DESCRIPTION = "A set of macros and tools to assist with cargo and rust packaging, written in a manner \
that follows upstream rust's best practices."
LICENSE = "MPL-2.0"

PV = "1.2.0+0"

RPM_NAME = "cargo-packaging-1.2.0+0-2.2.aarch64.rpm"
RPM_HASH = "eff2ab2a8f7e7d8969e0570cc80f78c48432df54a06bbbf203ae5ddd0a219e8cebefdca639b80e845c3db86bdd253beb89a1655f7cfb11787f1d6c424a873738"

RPROVIDES:${PN} += "cargo-packaging \
cargo-packaging(aarch-64) \
rpm_macro(cargo_build) \
rpm_macro(cargo_install) \
rpm_macro(cargo_test) \
rpm_macro(rust_arches) \
rpm_macro(rust_tier1_arches)"

RDEPENDS:${PN} += "cargo \
cargo-auditable \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
zstd"

inherit rpm
