SUMMARY = "A secure and free password manager for all of your devices"
DESCRIPTION = "Bitwarden is a free and open-source password management service that stores sensitive information such as website credentials in an encrypted vault.  Bitwarden offers a cloud-hosted service as well as the ability to deploy the solution on-premises. This package provides the GUI client."
LICENSE = "GPL-3.0-only & MIT & (Apache-2.0 | MIT)"

PV = "2023.7.1"

RPM_NAME = "bitwarden-2023.7.1-1.1.aarch64.rpm"
RPM_HASH = "03ec200bd1fb8c310230e07281f05e22df0628ae0bb1ae0750b8b0a741b9fa1a7d987d8d43850f8054b53b33338f77690d45803f1d80c4f8467d816665cdd1e4"

RPROVIDES:${PN} += "bitwarden \
bundled-rust-crate-aes \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-block-padding \
bundled-rust-crate-bytes \
bundled-rust-crate-cbc \
bundled-rust-crate-cfg-expr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cipher \
bundled-rust-crate-convert-case \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-ctor \
bundled-rust-crate-desktop-native \
bundled-rust-crate-digest \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-gio \
bundled-rust-crate-gio-sys \
bundled-rust-crate-glib \
bundled-rust-crate-glib-macros \
bundled-rust-crate-glib-sys \
bundled-rust-crate-gobject-sys \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-inout \
bundled-rust-crate-libc \
bundled-rust-crate-libsecret \
bundled-rust-crate-libsecret-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-napi \
bundled-rust-crate-napi-build \
bundled-rust-crate-napi-derive \
bundled-rust-crate-napi-derive-backend \
bundled-rust-crate-napi-sys \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-retry \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-sha2 \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-version-check \
bundled-rust-crate-version-compare \
bundled-rust-crate-winnow"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
nodejs-electron"

inherit rpm
