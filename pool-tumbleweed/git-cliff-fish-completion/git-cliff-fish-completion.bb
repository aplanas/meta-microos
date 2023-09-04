SUMMARY = "Fish Completion for git-cliff"
DESCRIPTION = "Fish command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-fish-completion-1.2.0-2.1.noarch.rpm"
RPM_HASH = "337c73f4b396b0ddeb6d622d08dd4287660826ad388c65bd956482806f4c84833107f12e88fc85efcded27eef0a80c50c66ea6457f9d069deab6586dccd020fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
