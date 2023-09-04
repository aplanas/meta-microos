SUMMARY = "Ls command with a lot of pretty colors and some other stuff"
DESCRIPTION = "Ls command with a lot of pretty colors and some other stuff."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "lsd-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "60b67b97e5582e4f6baf0572a76c06671d900b0f8d84c7daf7c26ef4b8d26e773ac330774e6aa83e4ab8550d24bd0443e888c4c4ce189f8e558b7200673cb0e6"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-humanize \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossterm \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-fnv \
bundled-rust-crate-git2 \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-human-sort \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-jobserver \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-lsd \
bundled-rust-crate-matches \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pure-rust-locales \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
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
bundled-rust-crate-sys-locale \
bundled-rust-crate-term-grid \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-users \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-check \
bundled-rust-crate-vsort \
bundled-rust-crate-wild \
bundled-rust-crate-xattr \
bundled-rust-crate-xdg \
bundled-rust-crate-yaml-rust \
lsd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
