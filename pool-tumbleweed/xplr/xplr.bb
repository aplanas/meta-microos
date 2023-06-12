SUMMARY = "TUI file explorer"
DESCRIPTION = "xplr is a terminal UI based file explorer for command-line utilities \
that work with the file-system. \
 \
xplr integrates shell commands and GUI file managers and exposes a \
scriptable, keyboard-controlled, real-time visual interface."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "xplr-0.21.2-1.1.aarch64.rpm"
RPM_HASH = "f9634e3958b9577d06aad6ea463b63bc897d9acced73818774805ab22687cf370239c9508b7f1a0d539ee7253f2a000087a850bab2bddaff368e106a5deb7c05"

RPROVIDES:${PN} += "application() \
application(xplr.desktop) \
bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi-to-tui) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:beef) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bstr) \
bundled(rust-crate:cassowary) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:crossbeam) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-deque) \
bundled(rust-crate:crossbeam-epoch) \
bundled(rust-crate:crossbeam-queue) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crossterm) \
bundled(rust-crate:darling) \
bundled(rust-crate:darling_core) \
bundled(rust-crate:darling_macro) \
bundled(rust-crate:defer-drop) \
bundled(rust-crate:derive_builder) \
bundled(rust-crate:derive_builder_core) \
bundled(rust-crate:derive_builder_macro) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:either) \
bundled(rust-crate:erased-serde) \
bundled(rust-crate:fnv) \
bundled(rust-crate:fuzzy-matcher) \
bundled(rust-crate:gethostname) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:humansize) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:ident_case) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jf) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libm) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:lscolors) \
bundled(rust-crate:lua-src) \
bundled(rust-crate:luajit-src) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:mime) \
bundled(rust-crate:mime_guess) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:mio) \
bundled(rust-crate:mlua) \
bundled(rust-crate:natord) \
bundled(rust-crate:nix) \
bundled(rust-crate:nom) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:num_threads) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:option-ext) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:path-absolutize) \
bundled(rust-crate:path-dedot) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:ratatui) \
bundled(rust-crate:rayon) \
bundled(rust-crate:rayon-core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:ryu) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-mio) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:skim) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:smawk) \
bundled(rust-crate:snailquote) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:term) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:timer) \
bundled(rust-crate:tui-input) \
bundled(rust-crate:tuikit) \
bundled(rust-crate:unicase) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-linebreak) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode_categories) \
bundled(rust-crate:unsafe-libyaml) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:version_check) \
bundled(rust-crate:vte) \
bundled(rust-crate:vte_generate_state_changes) \
bundled(rust-crate:which) \
bundled(rust-crate:xplr) \
config(xplr) \
mimehandler(inode/directory) \
xplr \
xplr(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GLIBC_2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm