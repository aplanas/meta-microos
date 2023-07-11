SUMMARY = "Fish Completion for helix"
DESCRIPTION = "Fish command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-fish-completion-23.05-2.1.noarch.rpm"
RPM_HASH = "0b9256ea62cd041f7ca25978053828251c9c4864733c22afbfd5cab5982e19efe43b6f1d460454c990aff73480d3b891aaf4ed84021cc10edc7e1d58dd06e63a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
