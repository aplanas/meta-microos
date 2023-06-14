SUMMARY = "Audit rust sources for known security vulnerabilities"
DESCRIPTION = "Audit Cargo.lock files for crates with security vulnerabilities reported to the RustSec Advisory Database."
LICENSE = "( 0BSD | MIT | Apache-2.0 ) & ( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | MIT ) & ( MIT | Zlib | Apache-2.0 ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & MIT & MPL-2.0 & MPL-2.0+"

PV = "0.17.5~git0.dc8ec71"

RPM_NAME = "cargo-audit-0.17.5~git0.dc8ec71-1.1.aarch64.rpm"
RPM_HASH = "325e9e0c9c3924b62abfb3a7d25ca7f642354ae32b5aa756136d13524616ab4e165d8df068533ce89a0653f18f2b9fa8dab9adf8630a8e1f112690775ba87850"

RPROVIDES:${PN} += "bundled-rust-crate-abscissa-core \
bundled-rust-crate-abscissa-derive \
bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-arc-swap \
bundled-rust-crate-atty \
bundled-rust-crate-auditable-extract \
bundled-rust-crate-auditable-info \
bundled-rust-crate-auditable-serde \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-binfarce \
bundled-rust-crate-bitflags \
bundled-rust-crate-canonical-path \
bundled-rust-crate-cargo-audit \
bundled-rust-crate-cargo-lock \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-eyre \
bundled-rust-crate-crates-index \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-cvss \
bundled-rust-crate-either \
bundled-rust-crate-eyre \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs-err \
bundled-rust-crate-gimli \
bundled-rust-crate-git2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-home \
bundled-rust-crate-humantime \
bundled-rust-crate-humantime-serde \
bundled-rust-crate-ident-case \
bundled-rust-crate-idna \
bundled-rust-crate-indenter \
bundled-rust-crate-indexmap \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libssh2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-log \
bundled-rust-crate-matchers \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-overload \
bundled-rust-crate-owo-colors \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-petgraph \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pkg-config \
bundled-rust-crate-platforms \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quitters \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustsec \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-secrecy \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sharded-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-smol-str \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-synstructure \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-topological-sort \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-tracing-log \
bundled-rust-crate-tracing-subscriber \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-url \
bundled-rust-crate-version-check \
bundled-rust-crate-wait-timeout \
bundled-rust-crate-winnow \
bundled-rust-crate-zeroize \
cargo-audit"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
