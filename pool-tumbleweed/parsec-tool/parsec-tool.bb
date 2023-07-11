SUMMARY = "Platform AbstRaction for SECurity"
DESCRIPTION = "A tool to communicate with the Parsec service on the command-line."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "parsec-tool-0.6.0-1.2.aarch64.rpm"
RPM_HASH = "227fe04a4d83d5cb170136d5d1e5152cb191ef10734f74941e7e581c709900ae53620db1560bcd4711112f51022f2f98d4139d7ac437b791d0b6fbdd91e71dbb"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-cmake \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-derivative \
bundled-rust-crate-digest \
bundled-rust-crate-either \
bundled-rust-crate-env-logger \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-generic-array \
bundled-rust-crate-heck \
bundled-rust-crate-humantime \
bundled-rust-crate-idna \
bundled-rust-crate-itertools \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-num \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-iter \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-oid \
bundled-rust-crate-once-cell \
bundled-rust-crate-opaque-debug \
bundled-rust-crate-parsec-client \
bundled-rust-crate-parsec-interface \
bundled-rust-crate-parsec-tool \
bundled-rust-crate-pem \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-picky-asn1 \
bundled-rust-crate-picky-asn1-der \
bundled-rust-crate-picky-asn1-x509 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-prost \
bundled-rust-crate-prost-derive \
bundled-rust-crate-psa-crypto \
bundled-rust-crate-psa-crypto-sys \
bundled-rust-crate-quote \
bundled-rust-crate-rcgen \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-ring \
bundled-rust-crate-same-file \
bundled-rust-crate-secrecy \
bundled-rust-crate-serde \
bundled-rust-crate-serde-bytes \
bundled-rust-crate-serde-derive \
bundled-rust-crate-sha2 \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-users \
bundled-rust-crate-uuid \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-yasna \
bundled-rust-crate-zeroize \
bundled-rust-crate-zeroize-derive \
parsec-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
parsec"

inherit rpm
