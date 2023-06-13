SUMMARY = "Ls command with a lot of pretty colors and some other stuff"
DESCRIPTION = "Ls command with a lot of pretty colors and some other stuff."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "lsd-0.23.1-1.2.aarch64.rpm"
RPM_HASH = "4c4f6bf789771d932dca2f7ca95978999f9d5b4fddd63e06b3400d27c7dc483dbc314a17aaf12603ead48bfb1cab94955b3426c12162a1ea0ec5b12f4a16dc9f"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bstr) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:chrono-humanize) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:crossterm) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:fnv) \
bundled(rust-crate:globset) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:human-sort) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:lscolors) \
bundled(rust-crate:lsd) \
bundled(rust-crate:matches) \
bundled(rust-crate:memchr) \
bundled(rust-crate:mio) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:ryu) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-mio) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:term_grid) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:time) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:url) \
bundled(rust-crate:users) \
bundled(rust-crate:version_check) \
bundled(rust-crate:wild) \
bundled(rust-crate:xattr) \
bundled(rust-crate:xdg) \
bundled(rust-crate:yaml-rust) \
lsd \
lsd(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
