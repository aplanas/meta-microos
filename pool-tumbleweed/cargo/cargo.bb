SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.70.0"

RPM_NAME = "cargo-1.70.0-1.1.aarch64.rpm"
RPM_HASH = "1d323d7a4aeac5e230772279afd56de5c98b20ac5eba5e2fedcf1bce587322524364691ecfbd1557a6cd8067852bc77509a4d4dc250db43d15e79055c157067c"

RPROVIDES:${PN} += "cargo \
rust+cargo"

RDEPENDS:${PN} += "cargo1.70 \
rust"

inherit rpm
