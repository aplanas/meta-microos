SUMMARY = "Fish completion for glab"
DESCRIPTION = "Fish command line completion support for glab."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "glab-fish-completion-1.30.0-1.1.noarch.rpm"
RPM_HASH = "75a0b1e34a30bf6ed08b55f11f726908d7d5eee1caa3bbff2c8465515521c303d7a56356f14e5d7a28673491826bcc233ff9c0ac15d889a4ee4d8cf5ac9b4876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-fish-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
