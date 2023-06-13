SUMMARY = "A command-line DNS client"
DESCRIPTION = "A command-line DNS client, like dig. It has colourful output, understands normal \
command-line argument syntax, supports the DNS-over-TLS and DNS-over-HTTPS protocols, \
and can emit JSON."
LICENSE = "EUPL-1.2"

PV = "0.1.0"

RPM_NAME = "dog-0.1.0-2.5.aarch64.rpm"
RPM_HASH = "1fed4c7e6dcf7b39b1217950aed78a0c70225c01fc371205b558ece95dc3801d20244551bf8440e747889f97975d58433db2cf66fb0ec52d7bf0ad42efc84e1b"

RPROVIDES:${PN} += "bundled(rust-crate:ansi_term) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:datetime) \
bundled(rust-crate:dns) \
bundled(rust-crate:dns-transport) \
bundled(rust-crate:dog) \
bundled(rust-crate:foreign-types) \
bundled(rust-crate:foreign-types-shared) \
bundled(rust-crate:getopts) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:httparse) \
bundled(rust-crate:itoa) \
bundled(rust-crate:libc) \
bundled(rust-crate:log) \
bundled(rust-crate:native-tls) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:openssl) \
bundled(rust-crate:openssl-macros) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:openssl-sys) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:ryu) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:syn) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-width) \
dog \
dog(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
