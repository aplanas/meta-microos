SUMMARY = "Wayland Clipboard Utility in Rust"
DESCRIPTION = "A safe Rust crate for working with the Wayland clipboard."
LICENSE = "Apache-2.0 & MIT"

PV = "0.7.0"

RPM_NAME = "wl-clipboard-rs-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "3f2ac4b62e834298c45df7c0651c02fce6429b10f5e487005c9326f641c689db1c9e779be60a110720ee0694e8a1bf1d46306feeec2e67aa436e7c5b4886f2af"

RPROVIDES:${PN} += "bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bytecount) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:derive-new) \
bundled(rust-crate:downcast-rs) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:fixedbitset) \
bundled(rust-crate:fnv) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:mime) \
bundled(rust-crate:mime_guess) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:nix) \
bundled(rust-crate:nom) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_pipe) \
bundled(rust-crate:petgraph) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:remove_dir_all) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:stderrlog) \
bundled(rust-crate:strsim) \
bundled(rust-crate:structopt) \
bundled(rust-crate:structopt-derive) \
bundled(rust-crate:syn) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:term_size) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:time) \
bundled(rust-crate:tree_magic_mini) \
bundled(rust-crate:unicase) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
bundled(rust-crate:wayland-client) \
bundled(rust-crate:wayland-commons) \
bundled(rust-crate:wayland-protocols) \
bundled(rust-crate:wayland-scanner) \
bundled(rust-crate:wayland-server) \
bundled(rust-crate:wayland-sys) \
bundled(rust-crate:wl-clipboard-rs) \
bundled(rust-crate:wl-clipboard-rs-tools) \
bundled(rust-crate:xml-rs) \
wl-clipboard-rs \
wl-clipboard-rs(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
