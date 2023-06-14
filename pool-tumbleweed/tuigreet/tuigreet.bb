SUMMARY = "Graphical console greeter for greetd"
DESCRIPTION = "Console UI greeter (using tui-rs)"
LICENSE = "GPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "tuigreet-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "26fdcc1d3605b8b753971e42db0941204cafd887d2bf3f136ff75e3f7d1ed1b8b2f68ae23f9a9e0b318cb4710937506e555873590d796e2427e03c6c00d9c817"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bytes \
bundled-rust-crate-cassowary \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossterm \
bundled-rust-crate-crypto-common \
bundled-rust-crate-dashmap \
bundled-rust-crate-digest \
bundled-rust-crate-displaydoc \
bundled-rust-crate-dlv-list \
bundled-rust-crate-find-crate \
bundled-rust-crate-fluent \
bundled-rust-crate-fluent-bundle \
bundled-rust-crate-fluent-langneg \
bundled-rust-crate-fluent-syntax \
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
bundled-rust-crate-getopts \
bundled-rust-crate-getrandom \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-hashbrown \
bundled-rust-crate-i18n-config \
bundled-rust-crate-i18n-embed \
bundled-rust-crate-i18n-embed-fl \
bundled-rust-crate-i18n-embed-impl \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-intl-memoizer \
bundled-rust-crate-intl-pluralrules \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-locale-config \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-multimap \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pure-rust-locales \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rust-embed \
bundled-rust-crate-rust-embed-impl \
bundled-rust-crate-rust-embed-utils \
bundled-rust-crate-rust-ini \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-self-cell \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha2 \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-smart-default \
bundled-rust-crate-smawk \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-tinystr \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml \
bundled-rust-crate-tui \
bundled-rust-crate-tuigreet \
bundled-rust-crate-type-map \
bundled-rust-crate-typenum \
bundled-rust-crate-unic-langid \
bundled-rust-crate-unic-langid-impl \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-zeroize \
tuigreet"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
