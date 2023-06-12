SUMMARY = "Fish Completion for swww"
DESCRIPTION = "Fish command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.3"

RPM_NAME = "swww-fish-completion-0.7.3-1.1.noarch.rpm"
RPM_HASH = "aca322675f368535ef342fd5c4265816e49b1710389ca03c77e12e7923ec0b2d7ddae81606ca959d3a0680b52dcc1d191783ecd28c8b341c6f9bf4f3b42f403b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
