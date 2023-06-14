SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.69.0"

RPM_NAME = "cargo-1.69.0-1.1.aarch64.rpm"
RPM_HASH = "b79c9588f5c25d63fff8a4a4ae87a6a74a511d6ee70be17701637a787b3fe9d82237cfcccbd6c3393c43556c2833e0e2c2d59d63373e03487f54d96447032631"

RPROVIDES:${PN} += "cargo \
rust+cargo"

RDEPENDS:${PN} += "cargo1.69 \
rust"

inherit rpm
