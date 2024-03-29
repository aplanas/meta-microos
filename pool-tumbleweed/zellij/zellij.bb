SUMMARY = "Terminal workspace with batteries included"
DESCRIPTION = "Zellij is a workspace aimed at developers, ops-oriented people and anyone who loves the terminal. \
At its core, it is a terminal multiplexer (similar to tmux and screen), but this is merely its \
infrastructure layer. \
 \
Zellij includes a layout system, and a plugin system allowing one to create plugins in any \
language that compiles to WebAssembly."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-0.37.2-2.1.aarch64.rpm"
RPM_HASH = "f44bf0bf3265a82e086ea6d18c8671033d38a3504c01d0503048c4fb1cc04fec6c35fc7ca209bcaaff92a1f969585af896f9308d5019b4eca794a0967c8561cb"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anyhow \
bundled-rust-crate-arc-swap \
bundled-rust-crate-arrayvec \
bundled-rust-crate-async-channel \
bundled-rust-crate-async-executor \
bundled-rust-crate-async-global-executor \
bundled-rust-crate-async-io \
bundled-rust-crate-async-lock \
bundled-rust-crate-async-process \
bundled-rust-crate-async-std \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-backtrace-ext \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blocking \
bundled-rust-crate-boxfnonce \
bundled-rust-crate-bytecheck \
bundled-rust-crate-bytecheck-derive \
bundled-rust-crate-byteorder \
bundled-rust-crate-cassowary \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-close-fds \
bundled-rust-crate-colored \
bundled-rust-crate-colorsys \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-console \
bundled-rust-crate-const-fn \
bundled-rust-crate-corosensei \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-cranelift-bforest \
bundled-rust-crate-cranelift-codegen \
bundled-rust-crate-cranelift-codegen-meta \
bundled-rust-crate-cranelift-codegen-shared \
bundled-rust-crate-cranelift-entity \
bundled-rust-crate-cranelift-frontend \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-csscolorparser \
bundled-rust-crate-ctor \
bundled-rust-crate-daemonize \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-deltae \
bundled-rust-crate-derivative \
bundled-rust-crate-destructure-traitobject \
bundled-rust-crate-dialoguer \
bundled-rust-crate-digest \
bundled-rust-crate-directories-next \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-dynasm \
bundled-rust-crate-dynasmrt \
bundled-rust-crate-either \
bundled-rust-crate-enum-iterator \
bundled-rust-crate-enum-iterator-derive \
bundled-rust-crate-enumset \
bundled-rust-crate-enumset-derive \
bundled-rust-crate-erased-serde \
bundled-rust-crate-event-listener \
bundled-rust-crate-fallible-iterator \
bundled-rust-crate-fastrand \
bundled-rust-crate-file-id \
bundled-rust-crate-filedescriptor \
bundled-rust-crate-filetime \
bundled-rust-crate-finl-unicode \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-funty \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-lite \
bundled-rust-crate-generational-arena \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-ghost \
bundled-rust-crate-gimli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-highway \
bundled-rust-crate-humantime \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-idna \
bundled-rust-crate-include-dir \
bundled-rust-crate-include-dir-macros \
bundled-rust-crate-indexmap \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-interprocess \
bundled-rust-crate-intmap \
bundled-rust-crate-inventory \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-ci \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-kdl \
bundled-rust-crate-kv-log-macro \
bundled-rust-crate-lab \
bundled-rust-crate-lazy-static \
bundled-rust-crate-leb128 \
bundled-rust-crate-lev-distance \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-log-mdc \
bundled-rust-crate-log4rs \
bundled-rust-crate-loupe \
bundled-rust-crate-loupe-derive \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memmem \
bundled-rust-crate-memoffset \
bundled-rust-crate-miette \
bundled-rust-crate-miette-derive \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-more-asserts \
bundled-rust-crate-names \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-notify \
bundled-rust-crate-notify-debouncer-full \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-option-ext \
bundled-rust-crate-ordered-float \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-owo-colors \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-macros \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-polling \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-ptr-meta \
bundled-rust-crate-ptr-meta-derive \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regalloc \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-region \
bundled-rust-crate-rend \
bundled-rust-crate-rkyv \
bundled-rust-crate-rkyv-derive \
bundled-rust-crate-rmp \
bundled-rust-crate-rmp-serde \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-seahash \
bundled-rust-crate-semver \
bundled-rust-crate-semver-parser \
bundled-rust-crate-serde \
bundled-rust-crate-serde-bytes \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-value \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-sha2 \
bundled-rust-crate-shell-words \
bundled-rust-crate-shellexpand \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-siphasher \
bundled-rust-crate-sixel-image \
bundled-rust-crate-sixel-tokenizer \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-smawk \
bundled-rust-crate-socket2 \
bundled-rust-crate-spinning \
bundled-rust-crate-stable-deref-trait \
bundled-rust-crate-standback \
bundled-rust-crate-strip-ansi-escapes \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-suggest \
bundled-rust-crate-supports-color \
bundled-rust-crate-supports-hyperlinks \
bundled-rust-crate-supports-unicode \
bundled-rust-crate-syn \
bundled-rust-crate-sysinfo \
bundled-rust-crate-tap \
bundled-rust-crate-target-lexicon \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-terminfo \
bundled-rust-crate-termios \
bundled-rust-crate-termwiz \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-id \
bundled-rust-crate-time \
bundled-rust-crate-time-macros \
bundled-rust-crate-time-macros-impl \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-to-method \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-typemap-ors \
bundled-rust-crate-typenum \
bundled-rust-crate-typetag \
bundled-rust-crate-typetag-impl \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-any-ors \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-value-bag \
bundled-rust-crate-version-check \
bundled-rust-crate-vte \
bundled-rust-crate-vte-generate-state-changes \
bundled-rust-crate-vtparse \
bundled-rust-crate-waker-fn \
bundled-rust-crate-walkdir \
bundled-rust-crate-wasm-encoder \
bundled-rust-crate-wasmer \
bundled-rust-crate-wasmer-artifact \
bundled-rust-crate-wasmer-compiler \
bundled-rust-crate-wasmer-compiler-cranelift \
bundled-rust-crate-wasmer-compiler-singlepass \
bundled-rust-crate-wasmer-derive \
bundled-rust-crate-wasmer-engine \
bundled-rust-crate-wasmer-engine-dylib \
bundled-rust-crate-wasmer-engine-universal \
bundled-rust-crate-wasmer-engine-universal-artifact \
bundled-rust-crate-wasmer-object \
bundled-rust-crate-wasmer-types \
bundled-rust-crate-wasmer-vfs \
bundled-rust-crate-wasmer-vm \
bundled-rust-crate-wasmer-wasi \
bundled-rust-crate-wasmer-wasi-types \
bundled-rust-crate-wasmparser \
bundled-rust-crate-wast \
bundled-rust-crate-wat \
bundled-rust-crate-wezterm-bidi \
bundled-rust-crate-wezterm-color-types \
bundled-rust-crate-wezterm-dynamic \
bundled-rust-crate-wezterm-dynamic-derive \
bundled-rust-crate-which \
bundled-rust-crate-wyz \
bundled-rust-crate-yaml-rust \
bundled-rust-crate-zellij \
bundled-rust-crate-zellij-client \
bundled-rust-crate-zellij-server \
bundled-rust-crate-zellij-utils \
bundled-rust-crate-zeroize \
zellij"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
