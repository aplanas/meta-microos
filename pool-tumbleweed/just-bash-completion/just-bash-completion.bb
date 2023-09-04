SUMMARY = "Bash Completion for just"
DESCRIPTION = "Bash command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-bash-completion-1.14.0-2.1.noarch.rpm"
RPM_HASH = "753e8389cce128e6c75cb3a6bc299c15dac8f634c9d48f6039189a413fcfc9af87d009246b0eb849b91f24745908cec961a236f6102a822bd15384b80786b550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
