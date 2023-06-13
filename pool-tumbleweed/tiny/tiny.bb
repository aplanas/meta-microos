SUMMARY = "Terminal IRC client written in Rust"
DESCRIPTION = "A terminal IRC client written in Rust."
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (MIT | Unlicense) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MIT"

PV = "0.10.0+git14"

RPM_NAME = "tiny-0.10.0+git14-2.1.aarch64.rpm"
RPM_HASH = "62925e27eff219615ee66271bf6af997678a80a51aabd5ef8dc46ac2959561de0fe6c94b3bd1cdad8672b824bec0670e023210a0068d6fe91ba062386fd25309"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:async-broadcast) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:async-executor) \
bundled(rust-crate:async-fs) \
bundled(rust-crate:async-io) \
bundled(rust-crate:async-lock) \
bundled(rust-crate:async-recursion) \
bundled(rust-crate:async-task) \
bundled(rust-crate:async-trait) \
bundled(rust-crate:atomic-waker) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:blocking) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:derivative) \
bundled(rust-crate:digest) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:enumflags2) \
bundled(rust-crate:enumflags2_derive) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-lite) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hex) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libtiny_client) \
bundled(rust-crate:libtiny_common) \
bundled(rust-crate:libtiny_logger) \
bundled(rust-crate:libtiny_tui) \
bundled(rust-crate:libtiny_wire) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:mio) \
bundled(rust-crate:nix) \
bundled(rust-crate:notify-rust) \
bundled(rust-crate:numtoa) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:ordered-stream) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:parking) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:polling) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-crate) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:ring) \
bundled(rust-crate:rustc_tools_util) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustls) \
bundled(rust-crate:rustls-native-certs) \
bundled(rust-crate:rustls-pemfile) \
bundled(rust-crate:ryu) \
bundled(rust-crate:sct) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_repr) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:sha1) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:slab) \
bundled(rust-crate:socket2) \
bundled(rust-crate:spin) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:term_input) \
bundled(rust-crate:term_input_macros) \
bundled(rust-crate:termbox_simple) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:termion) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:time) \
bundled(rust-crate:tiny) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-macros) \
bundled(rust-crate:tokio-rustls) \
bundled(rust-crate:tokio-stream) \
bundled(rust-crate:toml_datetime) \
bundled(rust-crate:toml_edit) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-attributes) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:typenum) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:version_check) \
bundled(rust-crate:waker-fn) \
bundled(rust-crate:webpki) \
bundled(rust-crate:winnow) \
bundled(rust-crate:xdg-home) \
bundled(rust-crate:yaml-rust) \
bundled(rust-crate:zbus) \
bundled(rust-crate:zbus_macros) \
bundled(rust-crate:zbus_names) \
bundled(rust-crate:zvariant) \
bundled(rust-crate:zvariant_derive) \
bundled(rust-crate:zvariant_utils) \
tiny \
tiny(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
pkgconfig(dbus-1) \
pkgconfig(openssl)"

inherit rpm
