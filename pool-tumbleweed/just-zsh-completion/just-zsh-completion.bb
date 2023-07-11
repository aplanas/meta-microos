SUMMARY = "Zsh Completion for just"
DESCRIPTION = "Zsh command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-zsh-completion-1.14.0-1.2.noarch.rpm"
RPM_HASH = "08f7bc85188fff8d14570700f064889e052a8f459c8492ef8ff675113f0c51a6cff7b5ad7862c7ea314913533f2f40c57840917efd7a8c32a2810bdd59803dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
