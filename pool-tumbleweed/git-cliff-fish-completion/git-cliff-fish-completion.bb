SUMMARY = "Fish Completion for git-cliff"
DESCRIPTION = "Fish command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-fish-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "5d7832bb12cf9209e372e52d9dc40a3bb8895ff8a0c663d2472d21dd51cdb44737515753b77bc2e1505c45fb343a102d67db131fe44c446c95b2d41543d4a9ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
