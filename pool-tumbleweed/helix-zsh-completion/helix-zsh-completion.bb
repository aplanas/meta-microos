SUMMARY = "Zsh Completion for helix"
DESCRIPTION = "Zsh command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-zsh-completion-23.05-2.1.noarch.rpm"
RPM_HASH = "e1036033a3cc44e5845180a9d62f1cf83dfe8ada4cf69b5dad0a737d88fa5075f0893077e3bd239a12b4fe8eec20fc9d4e4c0c161ad54af851e27f9a642c44a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
