SUMMARY = "A tool to calculate crc32c of files."
DESCRIPTION = "This is for fast verification only - crc32c is NOT a cryptographic verification"
LICENSE = "( Apache-2.0 | MIT ) & MIT & MPL-2.0 & MPL-2.0+"

PV = "0.1.0~0"

RPM_NAME = "crc32csum-0.1.0~0-1.5.aarch64.rpm"
RPM_HASH = "7d76aad43d85298f59228dd21d2af63e703d87775f00d9b296db84ba30c0b76fce58329f65bb9b257ac772830a4c9f95b9f14158b3cbe9e19604d25575584772"

RPROVIDES:${PN} += "bundled(rust-crate:bitflags) \
bundled(rust-crate:clap) \
bundled(rust-crate:crc32c) \
bundled(rust-crate:crc32csum) \
bundled(rust-crate:heck) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rustc_version) \
bundled(rust-crate:semver) \
bundled(rust-crate:structopt) \
bundled(rust-crate:structopt-derive) \
bundled(rust-crate:syn) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode-xid) \
bundled(rust-crate:version_check) \
crc32csum \
crc32csum(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
