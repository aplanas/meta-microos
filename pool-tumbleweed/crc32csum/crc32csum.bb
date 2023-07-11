SUMMARY = "A tool to calculate crc32c of files."
DESCRIPTION = "This is for fast verification only - crc32c is NOT a cryptographic verification"
LICENSE = "( Apache-2.0 | MIT ) & MIT & MPL-2.0 & MPL-2.0+"

PV = "0.1.0~0"

RPM_NAME = "crc32csum-0.1.0~0-1.6.aarch64.rpm"
RPM_HASH = "17957f12359412c5192c4f82e013cf3004eec0e507ebaa87b77703aa1dba88d9c872ccb50953f59161f16107b5db50f1190f3d24cea5e3d4a68ed9ef530ee387"

RPROVIDES:${PN} += "bundled-rust-crate-bitflags \
bundled-rust-crate-clap \
bundled-rust-crate-crc32c \
bundled-rust-crate-crc32csum \
bundled-rust-crate-heck \
bundled-rust-crate-lazy-static \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustc-version \
bundled-rust-crate-semver \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-version-check \
crc32csum"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
