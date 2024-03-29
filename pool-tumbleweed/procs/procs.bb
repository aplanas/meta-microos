SUMMARY = "A modern replacement for ps written in Rust"
DESCRIPTION = "procs is a replacement for ps written in Rust."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "procs-0.14.0-1.3.aarch64.rpm"
RPM_HASH = "4e4064b2b12680b6b072fe082d25a5bb759054179f4ab65450ec06e177b658ed4636bfffdefcc60607ad61a6d1b82615290ccd5080d937c4f044f2cbc03c417f"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-global-executor \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-std \
bundled-rust-crate-async-task \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-blocking \
bundled-rust-crate-byte-unit \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-console \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-ctor \
bundled-rust-crate-directories \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dockworker \
bundled-rust-crate-either \
bundled-rust-crate-errno \
bundled-rust-crate-event-listener \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
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
bundled-rust-crate-getch \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-hyper \
bundled-rust-crate-hyperlocal \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-instant \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-itoa \
bundled-rust-crate-kv-log-macro \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mime \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-minus \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-pager \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-polling \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procfs \
bundled-rust-crate-procs \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-termbg \
bundled-rust-crate-termcolor \
bundled-rust-crate-termios \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unix-socket \
bundled-rust-crate-url \
bundled-rust-crate-users \
bundled-rust-crate-utf8-width \
bundled-rust-crate-value-bag \
bundled-rust-crate-version-check \
bundled-rust-crate-waker-fn \
bundled-rust-crate-want \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-xattr \
procs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
