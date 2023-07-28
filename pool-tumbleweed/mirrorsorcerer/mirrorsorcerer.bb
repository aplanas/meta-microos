SUMMARY = "Mirror Sorcerer tool to magically make OpenSUSE mirror sources more magic-er"
DESCRIPTION = "This tool will profile official instances of OpenSUSE mirrorcache to determine the \
fastest repositories for your system 🧙"
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & BSD-3-Clause & MIT & MPL-2.0"

PV = "0.1.2~0"

RPM_NAME = "mirrorsorcerer-0.1.2~0-1.1.aarch64.rpm"
RPM_HASH = "481f52ecc7cf937bddf50fe35b1321b2a0f1dc71f634d09ab43bc6c3bdb981cb5e2003d189c5e729e2d22c2548eece9b1ec076e953001250daf264749bf25222"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-crc32c \
bundled-rust-crate-dlv-list \
bundled-rust-crate-filetime \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-idna \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-instant \
bundled-rust-crate-iovec \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lazycell \
bundled-rust-crate-libc \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-mio-extras \
bundled-rust-crate-mirrorsorcerer \
bundled-rust-crate-net2 \
bundled-rust-crate-notify \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-multimap \
bundled-rust-crate-overload \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pnet-base \
bundled-rust-crate-pnet-macros \
bundled-rust-crate-pnet-macros-support \
bundled-rust-crate-pnet-packet \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rust-ini \
bundled-rust-crate-rustc-version \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-surge-ping \
bundled-rust-crate-syn \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-users \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
mirrorsorcerer"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
