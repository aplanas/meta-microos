SUMMARY = "A post-modern modal text editor written in Rust"
DESCRIPTION = "A kakoune/neovim inspired modal text editor with built-in LSP and \
has treesitter support for syntax highlighting and improved navigation"
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-23.05-2.1.aarch64.rpm"
RPM_HASH = "f90f43b1c876c9a1a9c112db2da10e48bf0c1397db5e788c6519bc882236738d9df5f20a4c33daf95d2bd6bcf6adfe2f16e13ca6fef0a2d150d15136e4ecfcf9"

RPROVIDES:${PN} += "helix"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
