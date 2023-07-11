SUMMARY = "A lightning-fast system fetch tool made with Rust"
DESCRIPTION = "A lightning-fast minimalist system fetch tool made in Rust. Even faster than pfetch."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & MIT"

PV = "2.0.0~git0.5b3eac1"

RPM_NAME = "treefetch-2.0.0~git0.5b3eac1-3.5.aarch64.rpm"
RPM_HASH = "703f1a310b10d26619e021f8bee12ef92f25217a42c979ac10803e59f818cb619cc983071e01721cd8668f89b00b02b7569d126c76558a2ac812f9c3cda7bde8"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-memchr \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-treefetch \
treefetch"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
