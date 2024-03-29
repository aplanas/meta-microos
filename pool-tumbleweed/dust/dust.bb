SUMMARY = "A more intuitive version of du"
DESCRIPTION = "Dust is meant to give you an instant overview of which directories are using \
disk space without requiring sort or head. Dust will print a maximum of one \
'Did not have permissions message'."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-0.8.6-1.2.aarch64.rpm"
RPM_HASH = "8246defb0947c355a13afb6c2405c595634430ecd6b787f4bf32d130bb420f2c2a72173ac66f547466a7eee43de3e2d2aca6109beb9da4be379274e4a7c90d62"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-config-file \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-directories \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-du-dust \
bundled-rust-crate-either \
bundled-rust-crate-hashbrown \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lscolors \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-overload \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-stfu8 \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-sysinfo \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thousands \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
dust"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
