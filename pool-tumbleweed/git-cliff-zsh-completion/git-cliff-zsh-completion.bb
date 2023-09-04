SUMMARY = "Zsh Completion for git-cliff"
DESCRIPTION = "Zsh command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-zsh-completion-1.2.0-2.1.noarch.rpm"
RPM_HASH = "743b41df020e83c8e5ed3f2e5a79b200e50ed1d510869ce5e33ec016c7a71bd3bc4541a29eed950a097c82c688596d30f1e7567bf0043035a1546146f77883ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
