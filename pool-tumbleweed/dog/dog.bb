SUMMARY = "A command-line DNS client"
DESCRIPTION = "A command-line DNS client, like dig. It has colourful output, understands normal \
command-line argument syntax, supports the DNS-over-TLS and DNS-over-HTTPS protocols, \
and can emit JSON."
LICENSE = "EUPL-1.2"

PV = "0.1.0"

RPM_NAME = "dog-0.1.0-2.7.aarch64.rpm"
RPM_HASH = "e8c1c749841b5723383e98d76db323618b8f00bd42e46648d58b77c39afcf12431fda5d1c4f029488e8f3a76eb6344a5f6b9865051c43e98b997fa8199f174f5"

RPROVIDES:${PN} += "bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-byteorder \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-datetime \
bundled-rust-crate-dns \
bundled-rust-crate-dns-transport \
bundled-rust-crate-dog \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-getopts \
bundled-rust-crate-getrandom \
bundled-rust-crate-httparse \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-native-tls \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-json \
bundled-rust-crate-syn \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
dog"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3"

inherit rpm
