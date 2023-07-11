SUMMARY = "vhost-user virtio-fs device backend written in Rust"
DESCRIPTION = "vhost-user virtio-fs device backend written in Rust"
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "virtiofsd-1.6.1-2.2.aarch64.rpm"
RPM_HASH = "62006f26bffcee1fa1626cea506389e280b3c7821bb9b8582be7e096834265c5ce92c4849c4b47bbcaf0f8cd2bc27bfd44764bddd288e7f6dc3264930c4419b6"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-arc-swap \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-capng \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-env-logger \
bundled-rust-crate-error-chain \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-heck \
bundled-rust-crate-hostname \
bundled-rust-crate-humantime \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libseccomp-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-match-cfg \
bundled-rust-crate-memchr \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-slab \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-syslog \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-time \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
bundled-rust-crate-vhost \
bundled-rust-crate-vhost-user-backend \
bundled-rust-crate-virtio-bindings \
bundled-rust-crate-virtio-queue \
bundled-rust-crate-virtiofsd \
bundled-rust-crate-vm-memory \
bundled-rust-crate-vmm-sys-util \
virtiofsd"

RDEPENDS:${PN} += "libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
libseccomp.so.2"

inherit rpm
