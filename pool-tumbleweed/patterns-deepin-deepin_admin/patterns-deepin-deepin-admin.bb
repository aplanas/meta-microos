SUMMARY = "Deepin Administration Tools"
DESCRIPTION = "Administration Tools e.g. for desktop lockdown."
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_admin-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "39f8f3c7451c6c7d2570aad558f022ee0a137190f2334a2e1d21ac9738a61707df26864dbe7fb95c6ea63d7b24af9227efef35dad1191e2923b8c2482c0b190c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-deepin-deepin-admin"

RDEPENDS:${PN} += "pattern-"

inherit rpm
