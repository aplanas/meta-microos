SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.69.0"

RPM_NAME = "rust-1.69.0-1.1.aarch64.rpm"
RPM_HASH = "421f3c927846512cf43e36b5cee53b9e86691a148fb80d1df11ee663f09fecf7a355a7aef2faf034880c8100d51b625c8a39969d6373688059425dd89601f2b5"

RPROVIDES:${PN} += "rust"

RDEPENDS:${PN} += "rust1.69"

inherit rpm
