SUMMARY = "An implementation of tldr in Rust"
DESCRIPTION = "An implementation of tldr in Rust. It has example based and community-driven man pages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-1.6.1-2.1.aarch64.rpm"
RPM_HASH = "99616c1fcad4cdf890d5fd320aa4c6d18ba1b21317b857a0b4b66fc65b8e4a988d4451b94e37ae35d37281f9d72f632250ebb4755c2c96362e196cf549193676"

RPROVIDES:${PN} += "bundled(rust-crate:adler) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:app_dirs2) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:encoding_rs) \
bundled(rust-crate:errno) \
bundled(rust-crate:flate2) \
bundled(rust-crate:fnv) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:h2) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:http) \
bundled(rust-crate:http-body) \
bundled(rust-crate:httparse) \
bundled(rust-crate:httpdate) \
bundled(rust-crate:hyper) \
bundled(rust-crate:hyper-rustls) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:ipnet) \
bundled(rust-crate:itoa) \
bundled(rust-crate:libc) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:mime) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mio) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:pager) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:reqwest) \
bundled(rust-crate:ring) \
bundled(rust-crate:rustls) \
bundled(rust-crate:rustls-native-certs) \
bundled(rust-crate:rustls-pemfile) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:sct) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_urlencoded) \
bundled(rust-crate:slab) \
bundled(rust-crate:socket2) \
bundled(rust-crate:spin) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:tealdeer) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-rustls) \
bundled(rust-crate:tokio-util) \
bundled(rust-crate:toml) \
bundled(rust-crate:tower-service) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:try-lock) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:url) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:want) \
bundled(rust-crate:webpki) \
bundled(rust-crate:xdg) \
bundled(rust-crate:yansi) \
bundled(rust-crate:zip) \
tealdeer \
tealdeer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
