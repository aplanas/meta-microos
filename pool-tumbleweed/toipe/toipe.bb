SUMMARY = "Yet another typing test, but crab flavoured"
DESCRIPTION = "A commandline tool that launches a typing test. \
It looks best when used on a terminal with color and style support."
LICENSE = "(Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT) & (MIT | Unlicense) & MIT"

PV = "0.4.1+g12"

RPM_NAME = "toipe-0.4.1+g12-1.2.aarch64.rpm"
RPM_HASH = "6e87c93fe51485d87d13f86c119f2b62b351603873eed38a8bcb8b680304fb6568f9d7359ac6bb09819031d8cd7a2195e2c558f4e4819a22dfff1479af04c8fe"

RPROVIDES:${PN} += "bundled-rust-crate-adler32 \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bisection \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-crc32fast \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-include-flate \
bundled-rust-crate-include-flate-codegen \
bundled-rust-crate-include-flate-codegen-exports \
bundled-rust-crate-indexmap \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libflate \
bundled-rust-crate-libflate-lz77 \
bundled-rust-crate-numtoa \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rle-decode-fast \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-termion \
bundled-rust-crate-textwrap \
bundled-rust-crate-toipe \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
toipe"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
