SUMMARY = "A multi-threaded file-tree visualizer and disk usage analyzer"
DESCRIPTION = "A multi-threaded file-tree visualizer and disk usage analyzer."
LICENSE = "MIT"

PV = "3.0.1~0"

RPM_NAME = "erdtree-3.0.1~0-1.1.aarch64.rpm"
RPM_HASH = "1c61b031b1c7f3e8c47fbe2b358bb37751ff56b32fa87c2cecd59f85f5f6e8f7ff95665f593a9380b05ee9638046bc9ae942fdcf6468816557ad207378d4c356"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crossterm \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-erdtree \
bundled-rust-crate-errno \
bundled-rust-crate-filesize \
bundled-rust-crate-fnv \
bundled-rust-crate-globset \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ignore \
bundled-rust-crate-indextree \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-overload \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
erdtree"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
