SUMMARY = "Ls command with a lot of pretty colors and some other stuff"
DESCRIPTION = "Ls command with a lot of pretty colors and some other stuff."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "lsd-0.23.1-1.3.aarch64.rpm"
RPM_HASH = "503aa80ec503c42e21eef9b9cc45990f2db1a39de157bf52b533f0f72cb231df9e778fd3e2d2681a42792c3a3e1e541df47398427d60b72ac257e0570431edba"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-humanize \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-lex \
bundled-rust-crate-crossterm \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-fnv \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-human-sort \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-lsd \
bundled-rust-crate-matches \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-term-grid \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-time \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-users \
bundled-rust-crate-version-check \
bundled-rust-crate-wild \
bundled-rust-crate-xattr \
bundled-rust-crate-xdg \
bundled-rust-crate-yaml-rust \
lsd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
