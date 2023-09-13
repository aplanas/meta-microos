SUMMARY = "Multiplexer server for wezterm"
DESCRIPTION = "Multiplexer server for wezterm for running on a headless system."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-mux-server-20230712.072601.f4abf8fd-4.1.aarch64.rpm"
RPM_HASH = "4403fbfdd92e466d454b6a2c9578025fa89f213cb6a6f7bd7188edb86533796fc407e06955b76997c879c9a9754096a82858ca7c10730904c656ee6c3e7ca232"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-ahash \
bundled-rust-crate-aho-corasick \
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
bundled-rust-crate-async-ossl \
bundled-rust-crate-async-process \
bundled-rust-crate-async-task \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic \
bundled-rust-crate-atomic-waker \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-battery \
bundled-rust-crate-bintree \
bundled-rust-crate-bit-field \
bundled-rust-crate-bit-set \
bundled-rust-crate-bit-vec \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-blocking \
bundled-rust-crate-bstr \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytemuck-derive \
bundled-rust-crate-byteorder \
bundled-rust-crate-camino \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-codec \
bundled-rust-crate-color-funcs \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colorgrad \
bundled-rust-crate-concurrent-queue \
bundled-rust-crate-config \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-csscolorparser \
bundled-rust-crate-deltae \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-either \
bundled-rust-crate-enum-display-derive \
bundled-rust-crate-env-bootstrap \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-euclid \
bundled-rust-crate-event-listener \
bundled-rust-crate-exr \
bundled-rust-crate-fancy-regex \
bundled-rust-crate-fastrand \
bundled-rust-crate-fdeflate \
bundled-rust-crate-filedescriptor \
bundled-rust-crate-filenamegen \
bundled-rust-crate-filesystem \
bundled-rust-crate-filetime \
bundled-rust-crate-finl-unicode \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-flate2 \
bundled-rust-crate-flume \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
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
bundled-rust-crate-futures-timer \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-gethostname \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-gimli \
bundled-rust-crate-git2 \
bundled-rust-crate-governor \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hostname \
bundled-rust-crate-humansize \
bundled-rust-crate-humantime \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-image \
bundled-rust-crate-indexmap \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-instant \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-ioctl-rs \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-json \
bundled-rust-crate-lab \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lazycell \
bundled-rust-crate-leb128 \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libm \
bundled-rust-crate-libssh-rs \
bundled-rust-crate-libssh-rs-sys \
bundled-rust-crate-libssh2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-line-wrap \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-logging \
bundled-rust-crate-lru \
bundled-rust-crate-lua-src \
bundled-rust-crate-luahelper \
bundled-rust-crate-luajit-src \
bundled-rust-crate-mac-address \
bundled-rust-crate-match-cfg \
bundled-rust-crate-memchr \
bundled-rust-crate-memmem \
bundled-rust-crate-memoffset \
bundled-rust-crate-metrics \
bundled-rust-crate-metrics-macros \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-mlua \
bundled-rust-crate-mux \
bundled-rust-crate-mux-lua \
bundled-rust-crate-names \
bundled-rust-crate-nanorand \
bundled-rust-crate-nix \
bundled-rust-crate-no-std-compat \
bundled-rust-crate-nom \
bundled-rust-crate-nonzero-ext \
bundled-rust-crate-notify \
bundled-rust-crate-num \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-src \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-ordered-float \
bundled-rust-crate-parking \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pem \
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
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-plugin \
bundled-rust-crate-png \
bundled-rust-crate-polling \
bundled-rust-crate-portable-pty \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-procinfo \
bundled-rust-crate-procinfo-funcs \
bundled-rust-crate-promise \
bundled-rust-crate-pure-rust-locales \
bundled-rust-crate-qoi \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rangeset \
bundled-rust-crate-ratelim \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rcgen \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-safemem \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-semver-parser \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-serial \
bundled-rust-crate-serial-core \
bundled-rust-crate-serial-unix \
bundled-rust-crate-sha2 \
bundled-rust-crate-share-data \
bundled-rust-crate-shell-words \
bundled-rust-crate-shlex \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-siphasher \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-smawk \
bundled-rust-crate-smol \
bundled-rust-crate-socket2 \
bundled-rust-crate-spa \
bundled-rust-crate-spawn-funcs \
bundled-rust-crate-spin \
bundled-rust-crate-ssh-funcs \
bundled-rust-crate-ssh2 \
bundled-rust-crate-starship-battery \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-terminfo \
bundled-rust-crate-termios \
bundled-rust-crate-termwiz \
bundled-rust-crate-termwiz-funcs \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-funcs \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-umask \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-untrusted \
bundled-rust-crate-uom \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-varbincode \
bundled-rust-crate-version-check \
bundled-rust-crate-vtparse \
bundled-rust-crate-waker-fn \
bundled-rust-crate-walkdir \
bundled-rust-crate-weezl \
bundled-rust-crate-wezterm-bidi \
bundled-rust-crate-wezterm-blob-leases \
bundled-rust-crate-wezterm-client \
bundled-rust-crate-wezterm-color-types \
bundled-rust-crate-wezterm-config-derive \
bundled-rust-crate-wezterm-dynamic \
bundled-rust-crate-wezterm-dynamic-derive \
bundled-rust-crate-wezterm-gui-subcommands \
bundled-rust-crate-wezterm-input-types \
bundled-rust-crate-wezterm-mux-server \
bundled-rust-crate-wezterm-mux-server-impl \
bundled-rust-crate-wezterm-open-url \
bundled-rust-crate-wezterm-ssh \
bundled-rust-crate-wezterm-term \
bundled-rust-crate-wezterm-version \
bundled-rust-crate-winapi \
bundled-rust-crate-winnow \
bundled-rust-crate-yasna \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
bundled-rust-crate-zune-inflate \
wezterm-mux-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
