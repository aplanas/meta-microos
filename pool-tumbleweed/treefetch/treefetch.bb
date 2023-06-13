SUMMARY = "A lightning-fast system fetch tool made with Rust"
DESCRIPTION = "A lightning-fast minimalist system fetch tool made in Rust. Even faster than pfetch."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & MIT"

PV = "2.0.0~git0.5b3eac1"

RPM_NAME = "treefetch-2.0.0~git0.5b3eac1-3.4.aarch64.rpm"
RPM_HASH = "5f3059101d47498e05f2d5835fb4d3f52bb409cfa493c3702e185560e0c6fa1e0b364548d92b79b68231ac0fff8b1d94ccec5546b0c2ed1f1eace93ba31f83d6"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:memchr) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:treefetch) \
treefetch \
treefetch(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
