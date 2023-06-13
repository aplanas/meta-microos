SUMMARY = "Opinionated Lua code formatter"
DESCRIPTION = "StyLua is an opinonated code formatter for Lua 5.1, 5.2, 5.3, 5.4 and Luau \
built using full-moon. StyLua is inspired by the likes of prettier, it \
parses your Lua codebase, and prints it back out from scratch, enforcing a \
consistent code style."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & MIT & MPL-2.0 & MPL-2.0"

PV = "0.17.0"

RPM_NAME = "StyLua-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "78ebde7cd85def1fea4540d0d1a8bd9ca2e4db53590d6d7f7335579ce6c02eb6ccf275b72d6b37744286428cc07d30fdd3620573a5c1bd672b8174582d551a50"

RPROVIDES:${PN} += "StyLua \
StyLua(aarch-64) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:beef) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bstr) \
bundled(rust-crate:bytecount) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:console) \
bundled(rust-crate:convert_case) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:derive_more) \
bundled(rust-crate:ec4rs) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:fnv) \
bundled(rust-crate:full_moon) \
bundled(rust-crate:full_moon_derive) \
bundled(rust-crate:globset) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:ignore) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:itoa) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:log) \
bundled(rust-crate:logos) \
bundled(rust-crate:logos-derive) \
bundled(rust-crate:memchr) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:paste) \
bundled(rust-crate:paste-impl) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro-hack) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rustc_version) \
bundled(rust-crate:rustversion) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:similar) \
bundled(rust-crate:smol_str) \
bundled(rust-crate:strsim) \
bundled(rust-crate:strum) \
bundled(rust-crate:strum_macros) \
bundled(rust-crate:stylua) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:threadpool) \
bundled(rust-crate:toml) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
