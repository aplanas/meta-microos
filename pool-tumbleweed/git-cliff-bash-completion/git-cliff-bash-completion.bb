SUMMARY = "Bash Completion for git-cliff"
DESCRIPTION = "Bash command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-bash-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "eb8a803ab67609f07dc21ed9f613e4be2d30c7ec2f09706fa64db8aa8f25e1174e34276acdf013f7073fc545a55f08e61224a9eed9a42abe01786403e7e8dac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
