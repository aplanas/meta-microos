SUMMARY = "A man page generator for markdown markup files"
DESCRIPTION = "Mandown is a tool that generates man pages from markdown markup files."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "mandown-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "1e2ca35a76b356b9dc24a6a934f0ac1676534d66505db6d89c330882e6ee3fec3517efc5f55cd269548d1cff35681de7ac4b3613ac0181e88518e09f9043e8cb"

RPROVIDES:${PN} += "bundled-rust-crate-bitflags \
bundled-rust-crate-deunicode \
bundled-rust-crate-getopts \
bundled-rust-crate-mandown \
bundled-rust-crate-memchr \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
mandown"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
