SUMMARY = "CLI search and replace batch file editing tool"
DESCRIPTION = "Basically sad is a Batch File Edit tool. \
It will show you a really nice diff of proposed changes before you commit them. \
Unlike sed, you can double check before you fat finger your edit."
LICENSE = "(0BSD | Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & MIT & (Artistic-2.0 | CC0-1.0) & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & ISC & MIT & (MIT | Unlicense) & MPL-2.0 & MPL-2.0+ & Zlib & zlib-acknowledgement & Apache-2.0"

PV = "0.4.23"

RPM_NAME = "sad-0.4.23-1.1.aarch64.rpm"
RPM_HASH = "889543793fd6f72e447553e42483485dda8a8695aafcbe7e13b6ca7a3d1948111ed83add3c2ec641b09b1eb92fef160f8ee524cbd5764d9d4a1ac3378036f3c8"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-async-channel \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-difflib \
bundled-rust-crate-either \
bundled-rust-crate-event-listener \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-sad \
bundled-rust-crate-scopeguard \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-which \
sad"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
