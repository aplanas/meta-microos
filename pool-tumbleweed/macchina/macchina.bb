SUMMARY = "Fast, minimal and customizable system information frontend"
DESCRIPTION = "macchina lets you view system information, like your kernel version, uptime, memory usage, processor load and much more"
LICENSE = "MIT"

PV = "6.1.6"

RPM_NAME = "macchina-6.1.6-1.4.aarch64.rpm"
RPM_HASH = "a14c910ef48c68fcefdad5fc9460789f6815e874878eb1e1756e6b84bbab8dd03384f111c48f4cc361da2260e92a99d6daa15adc406c790d6b3c5b07a0749f25"

RPROVIDES:${PN} += "bundled-rust-crate-ansi-to-tui \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytesize \
bundled-rust-crate-cassowary \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-to-tui \
bundled-rust-crate-colored \
bundled-rust-crate-crossterm \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-either \
bundled-rust-crate-enum-iterator \
bundled-rust-crate-enum-iterator-derive \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-getset \
bundled-rust-crate-git2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-idna \
bundled-rust-crate-if-addrs \
bundled-rust-crate-indexmap \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libmacchina \
bundled-rust-crate-libz-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-macchina \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-mio \
bundled-rust-crate-nom \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-release \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shellexpand \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-sqlite \
bundled-rust-crate-sqlite3-src \
bundled-rust-crate-sqlite3-sys \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sysctl \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-tui \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-vergen \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
macchina"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
