SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.70.0"

RPM_NAME = "rust-1.70.0-1.1.aarch64.rpm"
RPM_HASH = "a68de1b68d93f95bad5e42adb61120fb21c28aea4a37b1195ccc6c7ce85d78ddd83793446997fa5b87f724d7e223929568c606b85cfd994d63874c8620e0961b"

RPROVIDES:${PN} += "rust"

RDEPENDS:${PN} += "rust1.70"

inherit rpm
