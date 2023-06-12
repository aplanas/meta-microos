SUMMARY = "An alternative to the 'find' utility"
DESCRIPTION = "fd is an alternative to GNU find. It features: \
 \
* Colorized terminal output (similar to ls). \
* The search is case-insensitive by default. It switches to \
  case-sensitive if the pattern contains an uppercase character. \
* By default, ignores patterns from .gitignore, and ignores hidden \
  directories and files. \
* Supports regular expressions and Unicode awareness. \
* A parallel execution similar to GNU Parallel is available."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-8.7.0-1.3.aarch64.rpm"
RPM_HASH = "ce0611a674c443ecc595e6c56ce4c44d21d6bc76ccd88c7b198bf6a5fefab412482a2a2973ec82ecbab75b29279590ed1f9286518b62eb0cb6a300bc7b6d71f0"

RPROVIDES:${PN} += "bundled(crate(aho-corasick)) \
bundled(crate(ansi_term)) \
bundled(crate(anyhow)) \
bundled(crate(atty)) \
bundled(crate(autocfg)) \
bundled(crate(bitflags)) \
bundled(crate(bstr)) \
bundled(crate(cc)) \
bundled(crate(cfg-if)) \
bundled(crate(chrono)) \
bundled(crate(clap)) \
bundled(crate(crossbeam-utils)) \
bundled(crate(ctrlc)) \
bundled(crate(diff)) \
bundled(crate(dirs-next)) \
bundled(crate(dirs-sys-next)) \
bundled(crate(fd-find)) \
bundled(crate(filetime)) \
bundled(crate(fnv)) \
bundled(crate(fs_extra)) \
bundled(crate(fuchsia-cprng)) \
bundled(crate(getrandom)) \
bundled(crate(globset)) \
bundled(crate(hermit-abi)) \
bundled(crate(humantime)) \
bundled(crate(ignore)) \
bundled(crate(jemalloc-sys)) \
bundled(crate(jemallocator)) \
bundled(crate(lazy_static)) \
bundled(crate(libc)) \
bundled(crate(log)) \
bundled(crate(lscolors)) \
bundled(crate(memchr)) \
bundled(crate(memoffset)) \
bundled(crate(nix)) \
bundled(crate(normpath)) \
bundled(crate(num-integer)) \
bundled(crate(num-traits)) \
bundled(crate(num_cpus)) \
bundled(crate(once_cell)) \
bundled(crate(proc-macro2)) \
bundled(crate(quote)) \
bundled(crate(rand)) \
bundled(crate(rand_core)) \
bundled(crate(rdrand)) \
bundled(crate(redox_syscall)) \
bundled(crate(redox_users)) \
bundled(crate(regex)) \
bundled(crate(regex-syntax)) \
bundled(crate(remove_dir_all)) \
bundled(crate(same-file)) \
bundled(crate(strsim)) \
bundled(crate(syn)) \
bundled(crate(tempdir)) \
bundled(crate(term_size)) \
bundled(crate(test-case)) \
bundled(crate(textwrap)) \
bundled(crate(thread_local)) \
bundled(crate(time)) \
bundled(crate(unicode-width)) \
bundled(crate(unicode-xid)) \
bundled(crate(users)) \
bundled(crate(vec_map)) \
bundled(crate(version_check)) \
bundled(crate(walkdir)) \
bundled(crate(wasi)) \
bundled(crate(winapi)) \
bundled(crate(winapi-i686-pc-windows-gnu)) \
bundled(crate(winapi-util)) \
bundled(crate(winapi-x86_64-pc-windows-gnu)) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:argmax) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bstr) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:ctrlc) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:faccess) \
bundled(rust-crate:fd-find) \
bundled(rust-crate:fnv) \
bundled(rust-crate:globset) \
bundled(rust-crate:heck) \
bundled(rust-crate:humantime) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:ignore) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:jemalloc-sys) \
bundled(rust-crate:jemallocator) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:log) \
bundled(rust-crate:lscolors) \
bundled(rust-crate:memchr) \
bundled(rust-crate:nix) \
bundled(rust-crate:normpath) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:overload) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rustix) \
bundled(rust-crate:same-file) \
bundled(rust-crate:serde) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:users) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
fd \
fd(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm