SUMMARY = "A more intuitive version of du"
DESCRIPTION = "Dust is meant to give you an instant overview of which directories are using \
disk space without requiring sort or head. Dust will print a maximum of one \
'Did not have permissions message'."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "c29086503052fad50e34360f9bd3b6ce75c8096b0eb317778495f3818ef8f9944d8ccb3b45569488b8d2e124887250116790840720a6fff3328db13bca1b0838"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:clap_mangen) \
bundled(rust-crate:config-file) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-deque) \
bundled(rust-crate:crossbeam-epoch) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:directories) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:du-dust) \
bundled(rust-crate:either) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lscolors) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:overload) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rayon) \
bundled(rust-crate:rayon-core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:roff) \
bundled(rust-crate:rustix) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:stfu8) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:sysinfo) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thousands) \
bundled(rust-crate:toml) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-width) \
dust \
dust(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
