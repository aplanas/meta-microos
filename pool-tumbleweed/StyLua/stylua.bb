SUMMARY = "Opinionated Lua code formatter"
DESCRIPTION = "StyLua is an opinonated code formatter for Lua 5.1, 5.2, 5.3, 5.4 and Luau \
built using full-moon. StyLua is inspired by the likes of prettier, it \
parses your Lua codebase, and prints it back out from scratch, enforcing a \
consistent code style."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & MIT & MPL-2.0 & MPL-2.0"

PV = "0.18.1"

RPM_NAME = "StyLua-0.18.1-1.1.aarch64.rpm"
RPM_HASH = "e862ee482cd9bd1e6ddd7dc59c398e10f611f02add3d47a9999bc227ad03f0b41a64a0b4ce9b0abbfc5ec8b5937251306a4636416593dd772da7a1da8c3a97a5"

RPROVIDES:${PN} += "StyLua \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-beef \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-bytecount \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-console \
bundled-rust-crate-convert-case \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-derive-more \
bundled-rust-crate-ec4rs \
bundled-rust-crate-env-logger \
bundled-rust-crate-equivalent \
bundled-rust-crate-fnv \
bundled-rust-crate-full-moon \
bundled-rust-crate-full-moon-derive \
bundled-rust-crate-globset \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-logos \
bundled-rust-crate-logos-derive \
bundled-rust-crate-memchr \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-paste \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-similar \
bundled-rust-crate-smol-str \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-stylua \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-threadpool \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-winnow"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
