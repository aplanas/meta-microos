SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.71.0"

RPM_NAME = "rust-1.71.0-1.1.aarch64.rpm"
RPM_HASH = "f2b9c2530c4c17c1ad96a6ada18ce9efdbaa4c914611e0707debd476da633c6233e0078ae9cd33a688c3b5098735a5132c055345afd3b810fbbe1777af86f17b"

RPROVIDES:${PN} += "rust"

RDEPENDS:${PN} += "rust1.71"

inherit rpm
