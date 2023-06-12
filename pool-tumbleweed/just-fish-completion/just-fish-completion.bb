SUMMARY = "Fish Completion for just"
DESCRIPTION = "Fish command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-fish-completion-1.14.0-1.1.noarch.rpm"
RPM_HASH = "c36dac45035f0b8a8702b5c385b33c6429893d769725d0bbe25419a8071f9760b1f1c2c462859c0a6f12bc645ed3f3deadccc5bca1d1f45e8bb06da6535b10c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
