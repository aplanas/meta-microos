SUMMARY = "Fish Completion for just"
DESCRIPTION = "Fish command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-fish-completion-1.14.0-1.2.noarch.rpm"
RPM_HASH = "e26c38ec825ed72db790a4fcf3d150dbce99f91f38dcf8f92efdcc06aa5450821706949f0d40d5dec865465699ff47dee7261cb5b55276e03b5f4472964d4236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
