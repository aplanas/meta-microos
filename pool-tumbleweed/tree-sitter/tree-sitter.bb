SUMMARY = "An incremental parsing system for programming tools"
DESCRIPTION = "Tree-sitter is a parser generator tool and an incremental parsing \
library. It can build a concrete syntax tree for a source file \
and efficiently update the syntax tree as the source file is \
edited. Tree-sitter aims to be: \
 \
 * General enough to parse any programming language \
 * Fast enough to parse on every keystroke in a text editor \
 * Robust enough to provide useful results even in the presence \
   of syntax errors \
 * Dependency-free so that the runtime library (which is written \
   in pure C) can be embedded in any application"
LICENSE = "MIT"

PV = "0.20.8"

RPM_NAME = "tree-sitter-0.20.8-2.1.aarch64.rpm"
RPM_HASH = "8a7bda4f7636ad9d814bfa229260296385bb8960386d38156a84e9468b48902a549a9aa5b6801760c4eedc191df493a767d842e6f48dae7d6eebdced28786e1a"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:ascii) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chunked_transfer) \
bundled(rust-crate:clap) \
bundled(rust-crate:difference) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:either) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:glob) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:html-escape) \
bundled(rust-crate:httpdate) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:itoa) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libloading) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:smallbitvec) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:tiny_http) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:toml) \
bundled(rust-crate:tree-sitter) \
bundled(rust-crate:tree-sitter-cli) \
bundled(rust-crate:tree-sitter-config) \
bundled(rust-crate:tree-sitter-highlight) \
bundled(rust-crate:tree-sitter-loader) \
bundled(rust-crate:tree-sitter-tags) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:url) \
bundled(rust-crate:utf8-width) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:webbrowser) \
bundled(rust-crate:which) \
tree-sitter \
tree-sitter(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libtree-sitter0"

inherit rpm
