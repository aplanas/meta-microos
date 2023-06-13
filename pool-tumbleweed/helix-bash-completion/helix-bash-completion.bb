SUMMARY = "Bash Completion for helix"
DESCRIPTION = "Bash command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-bash-completion-23.05-1.1.noarch.rpm"
RPM_HASH = "a65f73061dce5a916d39ab467b3bce86a7583ef4e790765a2cfa8d3b72202347c184a1d6776214a8ebd4c12063a3894b070c8b48777c4599f47a50db155506e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
