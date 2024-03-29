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

RPM_NAME = "fd-8.7.0-1.4.aarch64.rpm"
RPM_HASH = "ea1009dc012806c66cf23025fcfef5537d273a13d9084826b33612b0b782d762c1ccfe23db8dca9a894187b9c8b53fbbfacb89209e35a99e683bc7ee61fe55a7"

RPROVIDES:${PN} += "bundled-crate(aho-corasick) \
bundled-crate(ansi-term) \
bundled-crate(anyhow) \
bundled-crate(atty) \
bundled-crate(autocfg) \
bundled-crate(bitflags) \
bundled-crate(bstr) \
bundled-crate(cc) \
bundled-crate(cfg-if) \
bundled-crate(chrono) \
bundled-crate(clap) \
bundled-crate(crossbeam-utils) \
bundled-crate(ctrlc) \
bundled-crate(diff) \
bundled-crate(dirs-next) \
bundled-crate(dirs-sys-next) \
bundled-crate(fd-find) \
bundled-crate(filetime) \
bundled-crate(fnv) \
bundled-crate(fs-extra) \
bundled-crate(fuchsia-cprng) \
bundled-crate(getrandom) \
bundled-crate(globset) \
bundled-crate(hermit-abi) \
bundled-crate(humantime) \
bundled-crate(ignore) \
bundled-crate(jemalloc-sys) \
bundled-crate(jemallocator) \
bundled-crate(lazy-static) \
bundled-crate(libc) \
bundled-crate(log) \
bundled-crate(lscolors) \
bundled-crate(memchr) \
bundled-crate(memoffset) \
bundled-crate(nix) \
bundled-crate(normpath) \
bundled-crate(num-cpus) \
bundled-crate(num-integer) \
bundled-crate(num-traits) \
bundled-crate(once-cell) \
bundled-crate(proc-macro2) \
bundled-crate(quote) \
bundled-crate(rand) \
bundled-crate(rand-core) \
bundled-crate(rdrand) \
bundled-crate(redox-syscall) \
bundled-crate(redox-users) \
bundled-crate(regex) \
bundled-crate(regex-syntax) \
bundled-crate(remove-dir-all) \
bundled-crate(same-file) \
bundled-crate(strsim) \
bundled-crate(syn) \
bundled-crate(tempdir) \
bundled-crate(term-size) \
bundled-crate(test-case) \
bundled-crate(textwrap) \
bundled-crate(thread-local) \
bundled-crate(time) \
bundled-crate(unicode-width) \
bundled-crate(unicode-xid) \
bundled-crate(users) \
bundled-crate(vec-map) \
bundled-crate(version-check) \
bundled-crate(walkdir) \
bundled-crate(wasi) \
bundled-crate(winapi) \
bundled-crate(winapi-i686-pc-windows-gnu) \
bundled-crate(winapi-util) \
bundled-crate(winapi-x86-64-pc-windows-gnu) \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-argmax \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-ctrlc \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-faccess \
bundled-rust-crate-fd-find \
bundled-rust-crate-fnv \
bundled-rust-crate-globset \
bundled-rust-crate-heck \
bundled-rust-crate-humantime \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ignore \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-jemalloc-sys \
bundled-rust-crate-jemallocator \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-memchr \
bundled-rust-crate-nix \
bundled-rust-crate-normpath \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-overload \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thread-local \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-users \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
fd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
