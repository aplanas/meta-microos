SUMMARY = "Applets for Budgie Desktop Environment"
DESCRIPTION = "Applets for Budgie Desktop Environment"
LICENSE = "MIT"

PV = "20220527"

RPM_NAME = "patterns-budgie-budgie_applets-20220527-2.2.aarch64.rpm"
RPM_HASH = "f8d424fcbe645bc91a5ff7e34911c4ff5a19c6eef70b3c0707f840f0237df8a2188b64e1484e83738a6e1feb520a77e18e53d31a00c72150fc3781f031a4a9c8"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-budgie-budgie-applets"

RDEPENDS:${PN} += "pattern-"

inherit rpm
