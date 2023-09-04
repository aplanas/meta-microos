SUMMARY = "Terminal IRC client written in Rust"
DESCRIPTION = "A terminal IRC client written in Rust."
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (MIT | Unlicense) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MIT"

PV = "0.11.0+git7"

RPM_NAME = "tiny-0.11.0+git7-2.1.aarch64.rpm"
RPM_HASH = "4d6b6b95d67e09abf29b1142e2ebff6c347056509b22ec7d13d8192f1269b8a1da5bb96276ef16aed3b778b00f492489af38dac485afea1b968725242d9685d8"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
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
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blocking \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-derivative \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-enumflags2 \
bundled-rust-crate-enumflags2-derive \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-event-listener \
bundled-rust-crate-fastrand \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hex \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libtiny-client \
bundled-rust-crate-libtiny-common \
bundled-rust-crate-libtiny-logger \
bundled-rust-crate-libtiny-tui \
bundled-rust-crate-libtiny-wire \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-notify-rust \
bundled-rust-crate-numtoa \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-ordered-stream \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-parking \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-polling \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-tools-util \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-ryu \
bundled-rust-crate-sct \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-repr \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha1 \
bundled-rust-crate-shell-words \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-term-input \
bundled-rust-crate-term-input-macros \
bundled-rust-crate-termbox-simple \
bundled-rust-crate-termcolor \
bundled-rust-crate-termion \
bundled-rust-crate-textwrap \
bundled-rust-crate-time \
bundled-rust-crate-tiny \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-version-check \
bundled-rust-crate-waker-fn \
bundled-rust-crate-webpki \
bundled-rust-crate-winnow \
bundled-rust-crate-xdg-home \
bundled-rust-crate-yaml-rust \
bundled-rust-crate-zbus \
bundled-rust-crate-zbus-macros \
bundled-rust-crate-zbus-names \
bundled-rust-crate-zvariant \
bundled-rust-crate-zvariant-derive \
bundled-rust-crate-zvariant-utils \
tiny"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
pkgconfig-dbus-1 \
pkgconfig-openssl"

inherit rpm
