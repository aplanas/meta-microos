SUMMARY = "Zsh Completion for fuzzel"
DESCRIPTION = "Zsh command-line completion support for fuzzel"
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-zsh-completion-1.9.1-2.1.aarch64.rpm"
RPM_HASH = "40d37f1a6347d183c8edda1464511edb19142a79478fd82b7683bbff4ef93f27d96f298c844c50ecff68310cf0cf8bed79806a2d90fc4f2e1315c259a3f97d73"

RPROVIDES:${PN} += "fuzzel-zsh-completion \
fuzzel-zsh-completion(aarch-64)"
RDEPENDS:${PN} += "zsh"

inherit rpm
