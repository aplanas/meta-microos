SUMMARY = "A multi-threaded file-tree visualizer and disk usage analyzer"
DESCRIPTION = "A multi-threaded file-tree visualizer and disk usage analyzer."
LICENSE = "MIT"

PV = "2.0.0~0"

RPM_NAME = "erdtree-2.0.0~0-1.1.aarch64.rpm"
RPM_HASH = "1e962a8c47ae13ec028892e9be85a131179b5afa3bb120134e50c1092aee120c827b977ef8f6d14bdd77640ed33800674c8267a8fb05c5cebd6da56b9ed548a1"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) bundled(rust-crate:ansi_term) bundled(rust-crate:anstream) bundled(rust-crate:anstyle) bundled(rust-crate:anstyle-parse) bundled(rust-crate:anstyle-query) bundled(rust-crate:autocfg) bundled(rust-crate:bitflags) bundled(rust-crate:bstr) bundled(rust-crate:cfg-if) bundled(rust-crate:chrono) bundled(rust-crate:clap) bundled(rust-crate:clap_builder) bundled(rust-crate:clap_complete) bundled(rust-crate:clap_derive) bundled(rust-crate:clap_lex) bundled(rust-crate:colorchoice) bundled(rust-crate:erdtree) bundled(rust-crate:filesize) bundled(rust-crate:fnv) bundled(rust-crate:globset) bundled(rust-crate:heck) bundled(rust-crate:iana-time-zone) bundled(rust-crate:ignore) bundled(rust-crate:indextree) bundled(rust-crate:io-lifetimes) bundled(rust-crate:is-terminal) bundled(rust-crate:lazy_static) bundled(rust-crate:libc) bundled(rust-crate:linux-raw-sys) bundled(rust-crate:log) bundled(rust-crate:lscolors) bundled(rust-crate:memchr) bundled(rust-crate:nu-ansi-term) bundled(rust-crate:num-integer) bundled(rust-crate:num-traits) bundled(rust-crate:once_cell) bundled(rust-crate:overload) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:regex) bundled(rust-crate:regex-syntax) bundled(rust-crate:rustix) bundled(rust-crate:same-file) bundled(rust-crate:serde) bundled(rust-crate:strsim) bundled(rust-crate:syn) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:thread_local) bundled(rust-crate:time) bundled(rust-crate:unicode-ident) bundled(rust-crate:utf8parse) bundled(rust-crate:walkdir) erdtree erdtree(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
