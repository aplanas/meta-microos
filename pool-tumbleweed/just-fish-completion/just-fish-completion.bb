SUMMARY = "Fish Completion for just"
DESCRIPTION = "Fish command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-fish-completion-1.14.0-3.1.noarch.rpm"
RPM_HASH = "a161d68de6881110c1a3fa8c11dd8cbbd32dbd747dbade6a031c70ebcc815f61479cab140c19d96676083ec8901e11d3e0173e41c10d234eb993ffa9ebd8ad59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
