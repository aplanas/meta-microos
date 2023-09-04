SUMMARY = "Commmand runner"
DESCRIPTION = "Just is a command runner. Although it shares \
some similarities with 'make', it is not a build \
system."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-1.14.0-2.1.aarch64.rpm"
RPM_HASH = "4f3a2ea02c8db597285f37aa5cad972e541ab29232296c3fcb7585908cf469dd0f47302bb1beb2228a64723ce7897cccfc73a0db38ddb247a6b04f7a7d900156"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-camino \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crypto-common \
bundled-rust-crate-ctrlc \
bundled-rust-crate-derivative \
bundled-rust-crate-digest \
bundled-rust-crate-doc-comment \
bundled-rust-crate-dotenvy \
bundled-rust-crate-edit-distance \
bundled-rust-crate-env-logger \
bundled-rust-crate-fastrand \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-humantime \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-just \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lexiclean \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-nix \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha2 \
bundled-rust-crate-similar \
bundled-rust-crate-snafu \
bundled-rust-crate-snafu-derive \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-target \
bundled-rust-crate-tempfile \
bundled-rust-crate-term-size \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-typed-arena \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-uuid \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
just"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
