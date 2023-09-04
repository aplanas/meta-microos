SUMMARY = "CLI regex generator"
DESCRIPTION = "grex is a library as well as a command-line utility that is meant to simplify the \
often complicated and tedious task of creating regular expressions. It does so by \
automatically generating a single regular expression from user-provided test cases. \
The resulting expression is guaranteed to match the test cases which it was generated from. \
 \
It started as a Rust port of the JavaScript tool regexgen written by Devon Govett."
LICENSE = "Apache-2.0"

PV = "1.4.4"

RPM_NAME = "grex-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "29537972af1ab58dec96cb5994094070e7c50acbc08c70f340d35044321188f50f103186c1051aa3e8e36a06ba635eae3f90682b5cc60f5c1ea00d087d1684fc"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-either \
bundled-rust-crate-equivalent \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-grex \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-itertools \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-matches \
bundled-rust-crate-matrixmultiply \
bundled-rust-crate-memchr \
bundled-rust-crate-ndarray \
bundled-rust-crate-num-complex \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-petgraph \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rawpointer \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-terminal-size \
bundled-rust-crate-unic-char-property \
bundled-rust-crate-unic-char-range \
bundled-rust-crate-unic-common \
bundled-rust-crate-unic-ucd-category \
bundled-rust-crate-unic-ucd-version \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-utf8parse \
grex"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
