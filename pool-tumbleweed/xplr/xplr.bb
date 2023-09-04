SUMMARY = "TUI file explorer"
DESCRIPTION = "xplr is a terminal UI based file explorer for command-line utilities \
that work with the file-system. \
 \
xplr integrates shell commands and GUI file managers and exposes a \
scriptable, keyboard-controlled, real-time visual interface."
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "xplr-0.21.3-1.1.aarch64.rpm"
RPM_HASH = "f609d2e7abb83cf8d2075a22f8080d0fbfae0b4ad940359b42a18e2f83e367d1b975649926ba5857a2e1f6380ed8b15709aee31e1ccf687e5a8dcfb2f5c3f263"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-to-tui \
bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-beef \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cassowary \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-darling \
bundled-rust-crate-darling-core \
bundled-rust-crate-darling-macro \
bundled-rust-crate-defer-drop \
bundled-rust-crate-deranged \
bundled-rust-crate-derive-builder \
bundled-rust-crate-derive-builder-core \
bundled-rust-crate-derive-builder-macro \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-erased-serde \
bundled-rust-crate-fnv \
bundled-rust-crate-fuzzy-matcher \
bundled-rust-crate-gethostname \
bundled-rust-crate-hashbrown \
bundled-rust-crate-home \
bundled-rust-crate-humansize \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ident-case \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-itoa \
bundled-rust-crate-jf \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lscolors \
bundled-rust-crate-lua-src \
bundled-rust-crate-luajit-src \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mime \
bundled-rust-crate-mime-guess \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-mio \
bundled-rust-crate-mlua \
bundled-rust-crate-natord \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-paste \
bundled-rust-crate-path-absolutize \
bundled-rust-crate-path-dedot \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-ryu \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-skim \
bundled-rust-crate-smallvec \
bundled-rust-crate-smawk \
bundled-rust-crate-snailquote \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-term \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-timer \
bundled-rust-crate-tui-input \
bundled-rust-crate-tuikit \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-categories \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-linebreak \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unsafe-libyaml \
bundled-rust-crate-utf8parse \
bundled-rust-crate-version-check \
bundled-rust-crate-vte \
bundled-rust-crate-vte-generate-state-changes \
bundled-rust-crate-which \
bundled-rust-crate-xdg \
bundled-rust-crate-xplr \
config-xplr \
xplr"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
