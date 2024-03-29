SUMMARY = "Fast network port scanner"
DESCRIPTION = "Find all open ports fast with RustScan, then automatically \
pipe them into Nmap."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1+0"

RPM_NAME = "rustscan-2.1.1+0-2.1.aarch64.rpm"
RPM_HASH = "48f33c0d46782833111414b50de09147cccaedcf9109947799c7f6e18060ae8aa189a1d7cab28d2872ccaa5bfcebf4e48b8f01faa9ce14a3c25c2e998e47a534"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-global-executor \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-std \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-blocking \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cidr-utils \
bundled-rust-crate-clap \
bundled-rust-crate-colored \
bundled-rust-crate-colorful \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-ctor \
bundled-rust-crate-debug-helper \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-either \
bundled-rust-crate-enum-as-inner \
bundled-rust-crate-env-logger \
bundled-rust-crate-event-listener \
bundled-rust-crate-fastrand \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-gcd \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-heck \
bundled-rust-crate-hostname \
bundled-rust-crate-humantime \
bundled-rust-crate-idna \
bundled-rust-crate-iovec \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-kv-log-macro \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-log \
bundled-rust-crate-lru-cache \
bundled-rust-crate-match-cfg \
bundled-rust-crate-matches \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-net2 \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-polling \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-resolv-conf \
bundled-rust-crate-ring \
bundled-rust-crate-rlimit \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustls \
bundled-rust-crate-rustscan \
bundled-rust-crate-ryu \
bundled-rust-crate-sct \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shell-words \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-subprocess \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-text-placeholder \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-toml \
bundled-rust-crate-trust-dns-proto \
bundled-rust-crate-trust-dns-resolver \
bundled-rust-crate-trust-dns-rustls \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-value-bag \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
bundled-rust-crate-waker-fn \
bundled-rust-crate-webpki \
bundled-rust-crate-webpki-roots \
rustscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
nmap"

inherit rpm
