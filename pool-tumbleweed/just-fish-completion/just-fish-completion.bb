SUMMARY = "Fish Completion for just"
DESCRIPTION = "Fish command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-fish-completion-1.14.0-2.1.noarch.rpm"
RPM_HASH = "bd568b73b2c3f9afab659cb3c769813e08b8fc14779af4b861f7b1568da2be5b5add70d6b473596ac80939b85f7c7fc571085fc4ca3dca77cb4fb7b932f067c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
