SUMMARY = "Changelog generator for git repositories"
DESCRIPTION = "git-cliff is a utility to generate changelogs that follows the \
Conventional Commit Specifications."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "c789d805f58e95ff73d0333506a5ef03ce58ea63608bea8a813a58154dcca668267bba5c699fa7cbf8b92ec96f0a4a816fdf96aca5594d4c53f07661395344c8"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-async-trait \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-tz \
bundled-rust-crate-chrono-tz-build \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-config \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-deunicode \
bundled-rust-crate-digest \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-doc-comment \
bundled-rust-crate-env-logger \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-git-cliff \
bundled-rust-crate-git-cliff-core \
bundled-rust-crate-git-conventional \
bundled-rust-crate-git2 \
bundled-rust-crate-glob \
bundled-rust-crate-globset \
bundled-rust-crate-globwalk \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-humansize \
bundled-rust-crate-humantime \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-regex \
bundled-rust-crate-lazy-regex-proc-macros \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libm \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parse-zoneinfo \
bundled-rust-crate-pathdiff \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-pretty-env-logger \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rust-embed \
bundled-rust-crate-rust-embed-impl \
bundled-rust-crate-rust-embed-utils \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-regex \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha2 \
bundled-rust-crate-siphasher \
bundled-rust-crate-slug \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tera \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-uncased \
bundled-rust-crate-unic-char-property \
bundled-rust-crate-unic-char-range \
bundled-rust-crate-unic-common \
bundled-rust-crate-unic-segment \
bundled-rust-crate-unic-ucd-segment \
bundled-rust-crate-unic-ucd-version \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow \
bundled-rust-crate-yaml-rust \
git-cliff"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
