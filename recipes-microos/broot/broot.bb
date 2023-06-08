SUMMARY = "A better way to navigate directories"
DESCRIPTION = "A better way to navigate directories. \
Tree-like commandline directory navigator written in Rust."
LICENSE = "MIT"

PV = "1.21.0"

RPM_NAME = "broot-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "9e05285d8943d6e6007cf916e58cf206d2d6da0e8cbe7d496cc99354a0d737b32da3e5352b3aa450e885ea386a30837e956b4a3b26f5045e555e9d0f02c77758"

RPROVIDES:${PN} += "broot broot(aarch-64) bundled(rust-crate:adler) bundled(rust-crate:ahash) bundled(rust-crate:aho-corasick) bundled(rust-crate:ansi_colours) bundled(rust-crate:arrayref) bundled(rust-crate:arrayvec) bundled(rust-crate:atty) bundled(rust-crate:autocfg) bundled(rust-crate:base64) bundled(rust-crate:bet) bundled(rust-crate:bincode) bundled(rust-crate:bit_field) bundled(rust-crate:bitflags) bundled(rust-crate:broot) bundled(rust-crate:bstr) bundled(rust-crate:bytemuck) bundled(rust-crate:byteorder) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:char_reader) bundled(rust-crate:chrono) bundled(rust-crate:clap) bundled(rust-crate:clap_complete) bundled(rust-crate:clap_derive) bundled(rust-crate:clap_lex) bundled(rust-crate:cli-log) bundled(rust-crate:color_quant) bundled(rust-crate:coolor) bundled(rust-crate:crc32fast) bundled(rust-crate:crokey) bundled(rust-crate:crokey-proc_macros) bundled(rust-crate:crossbeam) bundled(rust-crate:crossbeam-channel) bundled(rust-crate:crossbeam-deque) bundled(rust-crate:crossbeam-epoch) bundled(rust-crate:crossbeam-queue) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:crossterm) bundled(rust-crate:custom_error) bundled(rust-crate:data-url) bundled(rust-crate:deser-hjson) bundled(rust-crate:directories) bundled(rust-crate:dirs-sys) bundled(rust-crate:doc-comment) bundled(rust-crate:either) bundled(rust-crate:exr) bundled(rust-crate:fastrand) bundled(rust-crate:file-size) bundled(rust-crate:flate2) bundled(rust-crate:float-cmp) bundled(rust-crate:flume) bundled(rust-crate:fnv) bundled(rust-crate:fontconfig-parser) bundled(rust-crate:fontdb) bundled(rust-crate:form_urlencoded) bundled(rust-crate:futures-core) bundled(rust-crate:futures-sink) bundled(rust-crate:getrandom) bundled(rust-crate:gif) bundled(rust-crate:git2) bundled(rust-crate:glob) bundled(rust-crate:half) bundled(rust-crate:hashbrown) bundled(rust-crate:heck) bundled(rust-crate:iana-time-zone) bundled(rust-crate:id-arena) bundled(rust-crate:idna) bundled(rust-crate:image) bundled(rust-crate:imagesize) bundled(rust-crate:include_dir) bundled(rust-crate:include_dir_macros) bundled(rust-crate:indexmap) bundled(rust-crate:itoa) bundled(rust-crate:jobserver) bundled(rust-crate:jpeg-decoder) bundled(rust-crate:kurbo) bundled(rust-crate:lazy-regex) bundled(rust-crate:lazy-regex-proc_macros) bundled(rust-crate:lazy_static) bundled(rust-crate:lebe) bundled(rust-crate:lfs-core) bundled(rust-crate:libc) bundled(rust-crate:libgit2-sys) bundled(rust-crate:libz-sys) bundled(rust-crate:line-wrap) bundled(rust-crate:linked-hash-map) bundled(rust-crate:lock_api) bundled(rust-crate:log) bundled(rust-crate:memchr) bundled(rust-crate:memmap2) bundled(rust-crate:memoffset) bundled(rust-crate:minimad) bundled(rust-crate:miniz_oxide) bundled(rust-crate:mio) bundled(rust-crate:nanorand) bundled(rust-crate:nix) bundled(rust-crate:num-integer) bundled(rust-crate:num-rational) bundled(rust-crate:num-traits) bundled(rust-crate:num_cpus) bundled(rust-crate:once_cell) bundled(rust-crate:onig) bundled(rust-crate:onig_sys) bundled(rust-crate:opener) bundled(rust-crate:os_str_bytes) bundled(rust-crate:parking_lot) bundled(rust-crate:parking_lot_core) bundled(rust-crate:pathdiff) bundled(rust-crate:percent-encoding) bundled(rust-crate:phf) bundled(rust-crate:phf_generator) bundled(rust-crate:phf_macros) bundled(rust-crate:phf_shared) bundled(rust-crate:pico-args) bundled(rust-crate:pin-project) bundled(rust-crate:pin-project-internal) bundled(rust-crate:pkg-config) bundled(rust-crate:plist) bundled(rust-crate:png) bundled(rust-crate:ppv-lite86) bundled(rust-crate:proc-macro-error) bundled(rust-crate:proc-macro-error-attr) bundled(rust-crate:proc-macro-hack) bundled(rust-crate:proc-macro2) bundled(rust-crate:proc-status) bundled(rust-crate:quick-xml) bundled(rust-crate:quote) bundled(rust-crate:rand) bundled(rust-crate:rand_chacha) bundled(rust-crate:rand_core) bundled(rust-crate:rayon) bundled(rust-crate:rayon-core) bundled(rust-crate:rctree) bundled(rust-crate:regex) bundled(rust-crate:regex-automata) bundled(rust-crate:regex-syntax) bundled(rust-crate:remove_dir_all) bundled(rust-crate:resvg) bundled(rust-crate:rgb) bundled(rust-crate:roxmltree) bundled(rust-crate:rustybuzz) bundled(rust-crate:ryu) bundled(rust-crate:safemem) bundled(rust-crate:same-file) bundled(rust-crate:scoped_threadpool) bundled(rust-crate:scopeguard) bundled(rust-crate:secular) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:signal-hook) bundled(rust-crate:signal-hook-mio) bundled(rust-crate:signal-hook-registry) bundled(rust-crate:simplecss) bundled(rust-crate:siphasher) bundled(rust-crate:smallvec) bundled(rust-crate:snafu) bundled(rust-crate:snafu-derive) bundled(rust-crate:spin) bundled(rust-crate:splitty) bundled(rust-crate:strict) bundled(rust-crate:strict-num) bundled(rust-crate:strsim) bundled(rust-crate:svgfilters) bundled(rust-crate:svgtypes) bundled(rust-crate:syn) bundled(rust-crate:syntect-no-panic) bundled(rust-crate:tempfile) bundled(rust-crate:termcolor) bundled(rust-crate:termimad) bundled(rust-crate:terminal-light) bundled(rust-crate:textwrap) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:threadpool) bundled(rust-crate:tiff) bundled(rust-crate:time) bundled(rust-crate:time-core) bundled(rust-crate:time-macros) bundled(rust-crate:tiny-skia) bundled(rust-crate:tiny-skia-path) bundled(rust-crate:tinyvec) bundled(rust-crate:tinyvec_macros) bundled(rust-crate:toml) bundled(rust-crate:ttf-parser) bundled(rust-crate:umask) bundled(rust-crate:unicode-bidi) bundled(rust-crate:unicode-bidi-mirroring) bundled(rust-crate:unicode-ccc) bundled(rust-crate:unicode-general-category) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-normalization) bundled(rust-crate:unicode-script) bundled(rust-crate:unicode-vo) bundled(rust-crate:unicode-width) bundled(rust-crate:url) bundled(rust-crate:users) bundled(rust-crate:usvg) bundled(rust-crate:usvg-text-layout) bundled(rust-crate:version_check) bundled(rust-crate:walkdir) bundled(rust-crate:weezl) bundled(rust-crate:which) bundled(rust-crate:xmlparser) bundled(rust-crate:xterm-query) bundled(rust-crate:yaml-rust)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
