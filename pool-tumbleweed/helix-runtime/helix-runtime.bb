SUMMARY = "Runtime files for helix"
DESCRIPTION = "Helix runtime files. Separated due to how huge the runtime files are. \
The runtime contains tree-sitter and grammars that makes run helix normally \
if there is no runtime present in the users config directory specifically \
`XDG_CONFIG_HOME/helix`."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-runtime-23.05-1.1.aarch64.rpm"
RPM_HASH = "164d084fd1dfb65a7276fe06b0d1506cb41376005dde7518f7f67d2076e1c893e15a3958a314d37e6835cdf12aea951b6cb7075dd570bd860b1868280242e3ca"

RPROVIDES:${PN} += "helix-runtime \
helix-runtime(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
