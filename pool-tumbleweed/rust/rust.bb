SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.72.0"

RPM_NAME = "rust-1.72.0-1.1.aarch64.rpm"
RPM_HASH = "7b158cd23aaf84478ba0256d5b480ea7645bb03396849a7c75bd81220d10511cfc04f3ea7d13cfd8f08db7e494cec7b58ca3c8f22ed1014b4d64f25d0fc3628c"

RPROVIDES:${PN} += "rust"

RDEPENDS:${PN} += "rust1.72"

inherit rpm
