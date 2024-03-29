SUMMARY = "A tiling window manager for adventurers"
DESCRIPTION = "LeftWM is a tiling window manager written in Rust that aims to be stable and performant."
LICENSE = "Apache-2.0 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | MPL-2.0) & BSD-2-Clause & BSD-3-Clause & (MIT | Unlicense)"

PV = "0.4.2"

RPM_NAME = "leftwm-0.4.2-2.1.aarch64.rpm"
RPM_HASH = "f2a913d63cc616b3de560ca0df6500a150dfabdcb2b6f8bdf74a9813e16a5bac05538a75f2658e6e25d34248cbb593a7c07bf40cd71a9863b779328c1c82192c"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-anymap2 \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-const-format \
bundled-rust-crate-const-format-proc-macros \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-doc-comment \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-git-version \
bundled-rust-crate-git-version-macro \
bundled-rust-crate-hashbrown \
bundled-rust-crate-home \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-kstring \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lefthk-core \
bundled-rust-crate-leftwm \
bundled-rust-crate-leftwm-core \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-liquid \
bundled-rust-crate-liquid-core \
bundled-rust-crate-liquid-derive \
bundled-rust-crate-liquid-lib \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-overload \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ron \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha2 \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shellexpand \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-journald \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-winnow \
bundled-rust-crate-x11-dl \
bundled-rust-crate-xdg \
bundled-rust-crate-xlib-display-server \
leftwm"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
