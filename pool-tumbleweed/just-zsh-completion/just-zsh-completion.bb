SUMMARY = "Zsh Completion for just"
DESCRIPTION = "Zsh command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-zsh-completion-1.14.0-2.1.noarch.rpm"
RPM_HASH = "4b57458cfc7794b3e150c15c9ccdd77388f5185788e2e1796db32f648fb5d7c8f3a1d643e0ea8149edb8d8331a451c58390a10b2c300c8b87bf4cca6be8149a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
