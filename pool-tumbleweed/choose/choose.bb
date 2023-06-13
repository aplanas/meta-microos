SUMMARY = "A human-friendly and fast alternative to cut and (sometimes) awk"
DESCRIPTION = "A human-friendly and fast alternative to cut and (sometimes) awk."
LICENSE = "MIT"

PV = "1.3.4~0"

RPM_NAME = "choose-1.3.4~0-1.3.aarch64.rpm"
RPM_HASH = "15b839603248342593efd3a0ade92fba4adf1c393ea97484faab0f65d77946c0050e81002afc5897279fe572495e433bebc5e8997e0b21848184e06d42f8501d"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:atty) \
bundled(rust-crate:backslash) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:choose) \
bundled(rust-crate:clap) \
bundled(rust-crate:heck) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:memchr) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:strsim) \
bundled(rust-crate:structopt) \
bundled(rust-crate:structopt-derive) \
bundled(rust-crate:syn) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
choose \
choose(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
