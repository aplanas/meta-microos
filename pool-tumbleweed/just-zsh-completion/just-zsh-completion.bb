SUMMARY = "Zsh Completion for just"
DESCRIPTION = "Zsh command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-zsh-completion-1.14.0-3.1.noarch.rpm"
RPM_HASH = "f3d245f9f169db4ee6fd6ace5a701a691886bbee10ce77415fcd0054b4cafac64319e72fc06b4126ec776ce9d287bf46582f1932e636fc494015bf94afc765c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
