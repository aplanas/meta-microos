SUMMARY = "Runtime files for helix"
DESCRIPTION = "Helix runtime files. Separated due to how huge the runtime files are. \
The runtime contains tree-sitter and grammars that makes run helix normally \
if there is no runtime present in the users config directory specifically \
`XDG_CONFIG_HOME/helix`."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-runtime-23.05-2.1.aarch64.rpm"
RPM_HASH = "fee82f9bcce8125a2129639befa9e8a93228b91287f2f02151044a40129393596fa6c3796407ab8af1f0f8f16376a37283c1f19447530346c0b92155a9ac1a19"

RPROVIDES:${PN} += "helix-runtime"

RDEPENDS:${PN} += "helix \
libc.so.6 \
libstdc++.so.6"

inherit rpm
