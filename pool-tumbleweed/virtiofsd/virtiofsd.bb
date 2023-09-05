SUMMARY = "vhost-user virtio-fs device backend written in Rust"
DESCRIPTION = "vhost-user virtio-fs device backend written in Rust"
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "virtiofsd-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "f49e9bd9ae0c79f7dafd250900a422ffefb79edae3ac727e42d4e589d1cdfa5b7222097d6e09cb68a99b9c101ffe03300c00da9fbb18f82d96ad9e1b8daba2c4"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-arc-swap \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-capng \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-deranged \
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
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-libseccomp-sys \
bundled-rust-crate-log \
bundled-rust-crate-match-cfg \
bundled-rust-crate-memchr \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-serde \
bundled-rust-crate-slab \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-syslog \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
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
