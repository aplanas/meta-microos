SUMMARY = "Terminal-based sequence editor for git interactive rebase"
DESCRIPTION = "Native cross-platform full feature terminal-based sequence editor for git interactive rebase."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0~0"

RPM_NAME = "git-interactive-rebase-tool-2.3.0~0-1.1.aarch64.rpm"
RPM_HASH = "d6e8da45791463631d4453933c266f1520171683e3577466fea3c58955a9d846de9ab48b6dd24641cd3bda49ceda307bd4de2487a8bc19064b19916ad0144d16"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-captur \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crossterm \
bundled-rust-crate-fastrand \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-girt-config \
bundled-rust-crate-girt-core \
bundled-rust-crate-girt-display \
bundled-rust-crate-girt-git \
bundled-rust-crate-girt-input \
bundled-rust-crate-girt-runtime \
bundled-rust-crate-girt-todo-file \
bundled-rust-crate-girt-view \
bundled-rust-crate-git-interactive-rebase-tool \
bundled-rust-crate-git2 \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-if-chain \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-mio \
bundled-rust-crate-num-format \
bundled-rust-crate-num-traits \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pico-args \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-uuid \
bundled-rust-crate-vcpkg \
bundled-rust-crate-version-track \
bundled-rust-crate-xi-unicode \
git-interactive-rebase-tool"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
