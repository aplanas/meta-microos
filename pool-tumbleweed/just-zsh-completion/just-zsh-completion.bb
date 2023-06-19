SUMMARY = "Zsh Completion for just"
DESCRIPTION = "Zsh command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-zsh-completion-1.14.0-1.1.noarch.rpm"
RPM_HASH = "8be7259f6b5365a6558ec496c29da2e2245580f61b718b63402be56b6a71b58161f0dffa3bfb43f2436292d4c46e03d403bf65969ae7fa8d647ba0ac6dc6d609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
