SUMMARY = "Terminal UI for git"
DESCRIPTION = "TUI for git with the following features: \
  * Fast and intuitive keyboard only control \
  * Context based help (no need to memorize tons of hot-keys) \
  * Inspect, commit, and amend changes (incl. hooks: pre-commit,commit-msg,post-commit) \
  * Stage, unstage, revert and reset files, hunks and lines \
  * Stashing (save, pop, apply, drop, and inspect) \
  * Push/Fetch to/from remote \
  * Branch List (create, rename, delete, checkout, remotes) \
  * Browse commit log, diff committed changes \
  * Scalable terminal UI layout \
  * Async git API for fluid control \
  * Submodule support"
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Artistic-2.0 | CC0-1.0) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CDDL-1.0 & ISC & MIT & MIT"

PV = "0.23.0"

RPM_NAME = "gitui-0.23.0-2.1.aarch64.rpm"
RPM_HASH = "02a8b4a2213673405d992e0f9daa91813274778d620c8cecee0bd09cb047147bda267f16f9a767746a8abe8d15c3527359bb8b29d0230d8b68ce858039891b9e"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-asyncgit \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-bugreport \
bundled-rust-crate-bytesize \
bundled-rust-crate-cassowary \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-easy-cast \
bundled-rust-crate-either \
bundled-rust-crate-fancy-regex \
bundled-rust-crate-filetime \
bundled-rust-crate-filetreelist \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fuzzy-matcher \
bundled-rust-crate-getrandom \
bundled-rust-crate-gh-emoji \
bundled-rust-crate-gimli \
bundled-rust-crate-git-version \
bundled-rust-crate-git-version-macro \
bundled-rust-crate-git2 \
bundled-rust-crate-gitui \
bundled-rust-crate-hashbrown \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libssh2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-notify \
bundled-rust-crate-notify-debouncer-mini \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-src \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-option-ext \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ron \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-scopetime \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shell-escape \
bundled-rust-crate-shellexpand \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simplelog \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallvec \
bundled-rust-crate-smawk \
bundled-rust-crate-strsim \
bundled-rust-crate-struct-patch \
bundled-rust-crate-struct-patch-derive \
bundled-rust-crate-syn \
bundled-rust-crate-syntect \
bundled-rust-crate-sys-info \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-truncate \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-which \
gitui"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
