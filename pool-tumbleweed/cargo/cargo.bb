SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.71.0"

RPM_NAME = "cargo-1.71.0-1.1.aarch64.rpm"
RPM_HASH = "0fb44f74d129f885d9dc376ec8bae46e193bbba5457c16694ed82d07975550734aab79610397dd2f1302c508c959db2113b49b9da92f93dab005aa7c34e039fb"

RPROVIDES:${PN} += "cargo \
rust+cargo"

RDEPENDS:${PN} += "cargo1.71 \
rust"

inherit rpm
