SUMMARY = "A syntax-highlighter for git and diff output"
DESCRIPTION = "Delta provides language syntax-highlighting, within-line insertion/deletion detection, and restructured diff output for git on the command line."
LICENSE = "MIT"

PV = "0.16.5"

RPM_NAME = "git-delta-0.16.5-1.2.aarch64.rpm"
RPM_HASH = "4496df8a6bcb607385a15daa88481ac0cbddac42798539eb1024fd97ac6018dd0f44ea90149bb887f7e2f60976b7291bd69500ba79c48c2d2b9172b9b8296580"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-colours \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-approx \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bat \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-box-drawing \
bundled-rust-crate-bstr \
bundled-rust-crate-bytelines \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytesize \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-humanize \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clircle \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-content-inspector \
bundled-rust-crate-crc32fast \
bundled-rust-crate-ctrlc \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-either \
bundled-rust-crate-encoding \
bundled-rust-crate-encoding-index-japanese \
bundled-rust-crate-encoding-index-korean \
bundled-rust-crate-encoding-index-simpchinese \
bundled-rust-crate-encoding-index-singlebyte \
bundled-rust-crate-encoding-index-tests \
bundled-rust-crate-encoding-index-tradchinese \
bundled-rust-crate-find-crate \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-git-delta \
bundled-rust-crate-git2 \
bundled-rust-crate-globset \
bundled-rust-crate-grep-cli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-home \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-line-wrap \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-onig \
bundled-rust-crate-onig-sys \
bundled-rust-crate-palette \
bundled-rust-crate-palette-derive \
bundled-rust-crate-path-abs \
bundled-rust-crate-pathdiff \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-macros \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rgb \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-safemem \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shell-words \
bundled-rust-crate-siphasher \
bundled-rust-crate-smol-str \
bundled-rust-crate-static-assertions \
bundled-rust-crate-std-prelude \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-syntect \
bundled-rust-crate-sysinfo \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vte \
bundled-rust-crate-vte-generate-state-changes \
bundled-rust-crate-walkdir \
bundled-rust-crate-xdg \
bundled-rust-crate-yaml-rust \
git-delta"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
