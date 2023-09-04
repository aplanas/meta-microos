SUMMARY = "A simple, terminal-based Erlang dashboard"
DESCRIPTION = "A simple, terminal-based Erlang dashboard. \
erldash connects to an Erlang node using the dynamic node name feature (since OTP-23) to collect metrics."
LICENSE = "MIT"

PV = "0.1.3~0"

RPM_NAME = "erldash-0.1.3~0-1.1.aarch64.rpm"
RPM_HASH = "799f1cadd84b869928b69600f0d0b5780f7003e53a4385d1aafad6d825771e00793a2479741a627262ea60f98fc5a1bc46934766e2b51450a4da64c45248744d"

RPROVIDES:${PN} += "bundled-rust-crate-adler32 \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-fs \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-net \
bundled-rust-crate-async-process \
bundled-rust-crate-async-task \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-blocking \
bundled-rust-crate-byteorder \
bundled-rust-crate-cassowary \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-eetf \
bundled-rust-crate-erl-dist \
bundled-rust-crate-erl-rpc \
bundled-rust-crate-erldash \
bundled-rust-crate-event-listener \
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
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libflate \
bundled-rust-crate-libflate-lz77 \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-md5 \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-num \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-ordered-float \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-polling \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rle-decode-fast \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simplelog \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-smol \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tui \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-waker-fn \
erldash"

RDEPENDS:${PN} += "erlang \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
