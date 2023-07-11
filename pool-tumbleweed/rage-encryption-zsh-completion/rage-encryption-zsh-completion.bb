SUMMARY = "Zsh Completion for rage-encryption"
DESCRIPTION = "Zsh command-line completion support for rage-encryption."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.2+0"

RPM_NAME = "rage-encryption-zsh-completion-0.9.2+0-1.1.noarch.rpm"
RPM_HASH = "7c648cab1cf76c29de4d587cf372b51999bc0af2f20516b363738d1f4be2b15e8b4af6f25ef2b26d03506a7f8ccb6f1e084eddd3359575564239664fb7ed0bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
