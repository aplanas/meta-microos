SUMMARY = "Upgrade all the things"
DESCRIPTION = "Keeping your system up to date usually involves invoking multiple package managers. This results in big, non-portable shell one-liners saved in your shell. \
To remedy this, Topgrade detects which tools you use and runs the appropriate commands to update them"
LICENSE = "GPL-3.0-only"

PV = "12.0.2"

RPM_NAME = "topgrade-12.0.2-1.1.aarch64.rpm"
RPM_HASH = "75c9465f7d92df4b7ae55ed04fb79f44872f0caf69638ef565a89a5add99c526544114ecbbf7204f47d39b2271da3d979878cc6d7995c41e05806eac4a742a68"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-async-broadcast \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-fs \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-recursion \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blocking \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-color-eyre \
bundled-rust-crate-color-spantrace \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-console \
bundled-rust-crate-const-random \
bundled-rust-crate-const-random-macro \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crunchy \
bundled-rust-crate-crypto-common \
bundled-rust-crate-derivative \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dlv-list \
bundled-rust-crate-either \
bundled-rust-crate-enumflags2 \
bundled-rust-crate-enumflags2-derive \
bundled-rust-crate-equivalent \
bundled-rust-crate-etcetera \
bundled-rust-crate-event-listener \
bundled-rust-crate-eyre \
bundled-rust-crate-fastrand \
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
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-home \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indenter \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-merge \
bundled-rust-crate-merge-derive \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-notify-rust \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-multimap \
bundled-rust-crate-ordered-stream \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-overload \
bundled-rust-crate-owo-colors \
bundled-rust-crate-parking \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-polling \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-split \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rust-ini \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-repr \
bundled-rust-crate-sha1 \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-shell-words \
bundled-rust-crate-shellexpand \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tiny-keccak \
bundled-rust-crate-tokio \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-topgrade \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-error \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
bundled-rust-crate-waker-fn \
bundled-rust-crate-walkdir \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-xdg-home \
bundled-rust-crate-zbus \
bundled-rust-crate-zbus-macros \
bundled-rust-crate-zbus-names \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
topgrade"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
