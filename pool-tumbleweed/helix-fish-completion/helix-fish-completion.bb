SUMMARY = "Fish Completion for helix"
DESCRIPTION = "Fish command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-fish-completion-23.05-3.1.noarch.rpm"
RPM_HASH = "1067fdfec9e5cba44c64e24087d7b2f5d519e421102c8e6baf4e406a2cbd6fc26741906477fdc30832bccdaea8d4235a01dd685fe72a1f7e4dd92421ad0f1209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
