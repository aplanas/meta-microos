SUMMARY = "Bash completion for rage-encryption"
DESCRIPTION = "Bash command line completion support for rage-encryption"
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.1+0"

RPM_NAME = "rage-encryption-bash-completion-0.9.1+0-2.1.noarch.rpm"
RPM_HASH = "e86fd697488afb4a9678ff4de58ca40847b0f1ba0361c1963acdd152f778da7d0bb6afc7df5d7b42dfd39b9c749bd1ea554e726f285c7ae08b9500d83666f8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-bash-completion"
RDEPENDS:${PN} += "bash-completion \
rage-encryption"

inherit rpm
