SUMMARY = "Bash Completion for just"
DESCRIPTION = "Bash command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-bash-completion-1.14.0-3.1.noarch.rpm"
RPM_HASH = "44911ce6a21fe9d92586e416c1ea0d6562e7186fb770ff48257746af6cb352517c3dac24a02b5844de9e8d5c05c81ed4385ce0305939fd7a4046a26e0b68d90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
