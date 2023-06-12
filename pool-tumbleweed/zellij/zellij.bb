SUMMARY = "Terminal workspace with batteries included"
DESCRIPTION = "Zellij is a workspace aimed at developers, ops-oriented people and anyone who loves the terminal. \
At its core, it is a terminal multiplexer (similar to tmux and screen), but this is merely its \
infrastructure layer. \
 \
Zellij includes a layout system, and a plugin system allowing one to create plugins in any \
language that compiles to WebAssembly."
LICENSE = "MIT"

PV = "0.36.0"

RPM_NAME = "zellij-0.36.0-1.1.aarch64.rpm"
RPM_HASH = "4b6a01ac2201b80a1623ba709957bebc1424751608a3b15429e4497748aa4ad8c7f96e3a69a930fc713e0aaafbd4e7e4ff7d95cf8f11e85686404fb76b2ca04b"

RPROVIDES:${PN} += "application() \
application(zellij.desktop) \
bundled(rust-crate:addr2line) \
bundled(rust-crate:adler) \
bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:arc-swap) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:async-executor) \
bundled(rust-crate:async-global-executor) \
bundled(rust-crate:async-io) \
bundled(rust-crate:async-lock) \
bundled(rust-crate:async-process) \
bundled(rust-crate:async-std) \
bundled(rust-crate:async-task) \
bundled(rust-crate:async-trait) \
bundled(rust-crate:atomic-waker) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:backtrace) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:blocking) \
bundled(rust-crate:boxfnonce) \
bundled(rust-crate:bytecheck) \
bundled(rust-crate:bytecheck_derive) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:cassowary) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:close_fds) \
bundled(rust-crate:colored) \
bundled(rust-crate:colorsys) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:console) \
bundled(rust-crate:const_fn) \
bundled(rust-crate:corosensei) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:cranelift-bforest) \
bundled(rust-crate:cranelift-codegen) \
bundled(rust-crate:cranelift-codegen-meta) \
bundled(rust-crate:cranelift-codegen-shared) \
bundled(rust-crate:cranelift-entity) \
bundled(rust-crate:cranelift-frontend) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crossbeam) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-deque) \
bundled(rust-crate:crossbeam-epoch) \
bundled(rust-crate:crossbeam-queue) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:csscolorparser) \
bundled(rust-crate:ctor) \
bundled(rust-crate:daemonize) \
bundled(rust-crate:darling) \
bundled(rust-crate:darling_core) \
bundled(rust-crate:darling_macro) \
bundled(rust-crate:deltae) \
bundled(rust-crate:derivative) \
bundled(rust-crate:destructure_traitobject) \
bundled(rust-crate:dialoguer) \
bundled(rust-crate:digest) \
bundled(rust-crate:directories-next) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:either) \
bundled(rust-crate:enum-iterator) \
bundled(rust-crate:enum-iterator-derive) \
bundled(rust-crate:enumset) \
bundled(rust-crate:enumset_derive) \
bundled(rust-crate:erased-serde) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:fallible-iterator) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:filedescriptor) \
bundled(rust-crate:finl_unicode) \
bundled(rust-crate:fixedbitset) \
bundled(rust-crate:fnv) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-lite) \
bundled(rust-crate:generational-arena) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:ghost) \
bundled(rust-crate:gimli) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:hex) \
bundled(rust-crate:highway) \
bundled(rust-crate:humantime) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:ident_case) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:interprocess) \
bundled(rust-crate:intmap) \
bundled(rust-crate:inventory) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is_ci) \
bundled(rust-crate:itoa) \
bundled(rust-crate:kdl) \
bundled(rust-crate:kv-log-macro) \
bundled(rust-crate:lab) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:leb128) \
bundled(rust-crate:lev_distance) \
bundled(rust-crate:libc) \
bundled(rust-crate:libloading) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:log-mdc) \
bundled(rust-crate:log4rs) \
bundled(rust-crate:loupe) \
bundled(rust-crate:loupe-derive) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memmap2) \
bundled(rust-crate:memmem) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:miette) \
bundled(rust-crate:miette-derive) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mio) \
bundled(rust-crate:more-asserts) \
bundled(rust-crate:names) \
bundled(rust-crate:nix) \
bundled(rust-crate:nom) \
bundled(rust-crate:num-derive) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:object) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:opaque-debug) \
bundled(rust-crate:ordered-float) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:owo-colors) \
bundled(rust-crate:parking) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:paste) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pest) \
bundled(rust-crate:pest_derive) \
bundled(rust-crate:pest_generator) \
bundled(rust-crate:pest_meta) \
bundled(rust-crate:phf) \
bundled(rust-crate:phf_codegen) \
bundled(rust-crate:phf_generator) \
bundled(rust-crate:phf_macros) \
bundled(rust-crate:phf_shared) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:polling) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro-hack) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:ptr_meta) \
bundled(rust-crate:ptr_meta_derive) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:rayon) \
bundled(rust-crate:rayon-core) \
bundled(rust-crate:regalloc) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:region) \
bundled(rust-crate:rend) \
bundled(rust-crate:rkyv) \
bundled(rust-crate:rkyv_derive) \
bundled(rust-crate:rmp) \
bundled(rust-crate:rmp-serde) \
bundled(rust-crate:rustc-demangle) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:rustc_version) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustversion) \
bundled(rust-crate:ryu) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:seahash) \
bundled(rust-crate:semver) \
bundled(rust-crate:semver-parser) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde-value) \
bundled(rust-crate:serde_bytes) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:sha2) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:simdutf8) \
bundled(rust-crate:siphasher) \
bundled(rust-crate:sixel-image) \
bundled(rust-crate:sixel-tokenizer) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:smawk) \
bundled(rust-crate:socket2) \
bundled(rust-crate:spinning) \
bundled(rust-crate:stable_deref_trait) \
bundled(rust-crate:standback) \
bundled(rust-crate:strip-ansi-escapes) \
bundled(rust-crate:strsim) \
bundled(rust-crate:strum) \
bundled(rust-crate:strum_macros) \
bundled(rust-crate:suggest) \
bundled(rust-crate:supports-color) \
bundled(rust-crate:supports-hyperlinks) \
bundled(rust-crate:supports-unicode) \
bundled(rust-crate:syn) \
bundled(rust-crate:sysinfo) \
bundled(rust-crate:target-lexicon) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:terminfo) \
bundled(rust-crate:termios) \
bundled(rust-crate:termwiz) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread-id) \
bundled(rust-crate:time) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:time-macros-impl) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:to_method) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-attributes) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:typemap-ors) \
bundled(rust-crate:typenum) \
bundled(rust-crate:typetag) \
bundled(rust-crate:typetag-impl) \
bundled(rust-crate:ucd-trie) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-linebreak) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unsafe-any-ors) \
bundled(rust-crate:url) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:uuid) \
bundled(rust-crate:value-bag) \
bundled(rust-crate:version_check) \
bundled(rust-crate:vte) \
bundled(rust-crate:vte_generate_state_changes) \
bundled(rust-crate:vtparse) \
bundled(rust-crate:waker-fn) \
bundled(rust-crate:wasm-encoder) \
bundled(rust-crate:wasmer) \
bundled(rust-crate:wasmer-artifact) \
bundled(rust-crate:wasmer-compiler) \
bundled(rust-crate:wasmer-compiler-cranelift) \
bundled(rust-crate:wasmer-derive) \
bundled(rust-crate:wasmer-engine) \
bundled(rust-crate:wasmer-engine-dylib) \
bundled(rust-crate:wasmer-engine-universal) \
bundled(rust-crate:wasmer-engine-universal-artifact) \
bundled(rust-crate:wasmer-object) \
bundled(rust-crate:wasmer-types) \
bundled(rust-crate:wasmer-vfs) \
bundled(rust-crate:wasmer-vm) \
bundled(rust-crate:wasmer-wasi) \
bundled(rust-crate:wasmer-wasi-types) \
bundled(rust-crate:wasmparser) \
bundled(rust-crate:wast) \
bundled(rust-crate:wat) \
bundled(rust-crate:wezterm-bidi) \
bundled(rust-crate:wezterm-color-types) \
bundled(rust-crate:wezterm-dynamic) \
bundled(rust-crate:wezterm-dynamic-derive) \
bundled(rust-crate:which) \
bundled(rust-crate:yaml-rust) \
bundled(rust-crate:zellij) \
bundled(rust-crate:zellij-client) \
bundled(rust-crate:zellij-server) \
bundled(rust-crate:zellij-utils) \
bundled(rust-crate:zeroize) \
zellij \
zellij(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GLIBC_2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm