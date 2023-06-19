SUMMARY = "Zsh Completion for git-cliff"
DESCRIPTION = "Zsh command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-zsh-completion-1.2.0-1.1.noarch.rpm"
RPM_HASH = "25cbd2d978256f48c263abeb23ded9d7d358d18e16f52debd3eccebc0d0c49c951f1ce1e8d4107d2a794e104d0bf884ac8d126ec6f8fa8b7ccfdab2ef6e21431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
