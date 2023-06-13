SUMMARY = "Fish Completion for helix"
DESCRIPTION = "Fish command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-fish-completion-23.05-1.1.noarch.rpm"
RPM_HASH = "932c722ee109bb96b4f45162f8ce8ff1fc4606a79d69665e831a3f2e4c8f062431cc643005b85907f4916365a39ecfa27dafa3c03c28ffd9b0d5f9cb0bcbf65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
