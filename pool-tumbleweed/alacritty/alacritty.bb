SUMMARY = "A GPU-accelerated terminal emulator"
DESCRIPTION = "Alacritty is a terminal emulator written in Rust that leverages the GPU for \
rendering."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "alacritty-0.12.1-1.1.aarch64.rpm"
RPM_HASH = "f30b58cf4c1a486ef62cd2062a2ec1bfc2c5e302db8308f0795ffd607895300f8a1d650083c1afc9e1d9470d6cb92f3c2c96fe1f8b08f6f71cf9e3a50acbfe68"

RPROVIDES:${PN} += "alacritty \
alacritty(aarch-64) \
application() \
application(Alacritty.desktop) \
bundled(rust-crate:adler) \
bundled(rust-crate:alacritty) \
bundled(rust-crate:alacritty_config) \
bundled(rust-crate:alacritty_config_derive) \
bundled(rust-crate:alacritty_terminal) \
bundled(rust-crate:arrayref) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bytemuck) \
bundled(rust-crate:calloop) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:cfg_aliases) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:cmake) \
bundled(rust-crate:copypasta) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crossfont) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dlib) \
bundled(rust-crate:downcast-rs) \
bundled(rust-crate:expat-sys) \
bundled(rust-crate:fdeflate) \
bundled(rust-crate:filetime) \
bundled(rust-crate:flate2) \
bundled(rust-crate:fnv) \
bundled(rust-crate:foreign-types) \
bundled(rust-crate:foreign-types-macros) \
bundled(rust-crate:foreign-types-shared) \
bundled(rust-crate:freetype-rs) \
bundled(rust-crate:freetype-sys) \
bundled(rust-crate:gethostname) \
bundled(rust-crate:gl_generator) \
bundled(rust-crate:glutin) \
bundled(rust-crate:glutin_egl_sys) \
bundled(rust-crate:glutin_glx_sys) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:home) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:inotify) \
bundled(rust-crate:inotify-sys) \
bundled(rust-crate:instant) \
bundled(rust-crate:iovec) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jobserver) \
bundled(rust-crate:khronos_api) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lazycell) \
bundled(rust-crate:libc) \
bundled(rust-crate:libloading) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memmap2) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mio) \
bundled(rust-crate:mio-extras) \
bundled(rust-crate:mio-uds) \
bundled(rust-crate:net2) \
bundled(rust-crate:nix) \
bundled(rust-crate:nom) \
bundled(rust-crate:notify) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:png) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:raw-window-handle) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scoped-tls) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:sctk-adwaita) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:servo-fontconfig) \
bundled(rust-crate:servo-fontconfig-sys) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-mio) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:simd-adler32) \
bundled(rust-crate:slab) \
bundled(rust-crate:slotmap) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:smithay-client-toolkit) \
bundled(rust-crate:smithay-clipboard) \
bundled(rust-crate:strict-num) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:tiny-skia) \
bundled(rust-crate:tiny-skia-path) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
bundled(rust-crate:vte) \
bundled(rust-crate:vte_generate_state_changes) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:wayland-client) \
bundled(rust-crate:wayland-commons) \
bundled(rust-crate:wayland-cursor) \
bundled(rust-crate:wayland-protocols) \
bundled(rust-crate:wayland-scanner) \
bundled(rust-crate:wayland-sys) \
bundled(rust-crate:winit) \
bundled(rust-crate:x11-clipboard) \
bundled(rust-crate:x11-dl) \
bundled(rust-crate:x11rb) \
bundled(rust-crate:x11rb-protocol) \
bundled(rust-crate:xcursor) \
bundled(rust-crate:xdg) \
bundled(rust-crate:xml-rs) \
bundled(rust-crate:yaml-rust) \
metainfo() \
metainfo(org.alacritty.Alacritty.appdata.xml)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm