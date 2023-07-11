SUMMARY = "Bash completion for rage-encryption"
DESCRIPTION = "Bash command line completion support for rage-encryption"
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.2+0"

RPM_NAME = "rage-encryption-bash-completion-0.9.2+0-1.1.noarch.rpm"
RPM_HASH = "ce1cde90f757a2b30674d6287726a43fa1533215eeaa6095678a0eb968cfa8a87d604e4abe0cf3ff473155d33da2198365eef04c6a72a68c7b8759d7c7278d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rage-encryption"

inherit rpm
