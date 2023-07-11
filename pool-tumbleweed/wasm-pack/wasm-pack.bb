SUMMARY = "Your favorite Rust → Wasm workflow tool!"
DESCRIPTION = "This tool seeks to be a one-stop shop for building and working with rust- generated WebAssembly that \
you would like to interop with JavaScript, in the browser or with Node.js. wasm-pack helps you build \
rust-generated WebAssembly packages that you could publish to the npm registry, or otherwise use \
alongside any javascript packages in workflows that you already use, such as webpack."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT"

PV = "0.12.1~0"

RPM_NAME = "wasm-pack-0.12.1~0-1.1.aarch64.rpm"
RPM_HASH = "6568c86078a6f7dc3191c06bcfe10c1cce49678a49159c2dba48dde21fbaaa015e88aff80f410beab55b86131e82761a6c65d98f62878fe13313afd3bd07d10a"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-aes \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-base64ct \
bundled-rust-crate-binary-install \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-byteorder \
bundled-rust-crate-bzip2 \
bundled-rust-crate-bzip2-sys \
bundled-rust-crate-camino \
bundled-rust-crate-cargo-metadata \
bundled-rust-crate-cargo-platform \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-cipher \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crypto-common \
bundled-rust-crate-dialoguer \
bundled-rust-crate-digest \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-either \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs2 \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-hmac \
bundled-rust-crate-human-panic \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-inout \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-executable \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-info \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-password-hash \
bundled-rust-crate-pbkdf2 \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand-core \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sct \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-ignored \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha1 \
bundled-rust-crate-sha2 \
bundled-rust-crate-shell-words \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallvec \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-ureq \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-wasm-pack \
bundled-rust-crate-webpki-roots \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-xattr \
bundled-rust-crate-zeroize \
bundled-rust-crate-zip \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
wasm-pack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
