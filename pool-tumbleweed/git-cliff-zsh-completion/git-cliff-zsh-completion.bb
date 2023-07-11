SUMMARY = "Zsh Completion for git-cliff"
DESCRIPTION = "Zsh command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-zsh-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "4077597151ecccc3c7ed83908c7aba51912b687d276d8b3c5de7ad4aa8b48dc1338e4a174e0591c9fecd9149cadd327867b8174e537c52374823da3c2ac17cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
