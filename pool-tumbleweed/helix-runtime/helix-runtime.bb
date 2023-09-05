SUMMARY = "Runtime files for helix"
DESCRIPTION = "Helix runtime files. Separated due to how huge the runtime files are. \
The runtime contains tree-sitter and grammars that makes run helix normally \
if there is no runtime present in the users config directory specifically \
`XDG_CONFIG_HOME/helix`."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-runtime-23.05-3.1.aarch64.rpm"
RPM_HASH = "fa514c558f6817e7cc6ec76ea346c71e1ab3c4d112010d4051842d1c1e0abab6390c7baf792983e6073b9340903c2871b383312219dab20b40a214414f27e523"

RPROVIDES:${PN} += "helix-runtime"

RDEPENDS:${PN} += "helix \
libc.so.6 \
libstdc++.so.6"

inherit rpm
