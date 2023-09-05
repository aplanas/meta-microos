SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.72.0"

RPM_NAME = "cargo-1.72.0-1.1.aarch64.rpm"
RPM_HASH = "9ba0e65b71d900ef9b34d45fee5c8decf32c51ec7fe91c812c4d5b6f155ba64dc014324cc941f4673b99034f52672cf7670753c90933a8989de6a7d80b171303"

RPROVIDES:${PN} += "cargo \
rust+cargo"

RDEPENDS:${PN} += "cargo1.72 \
rust"

inherit rpm
