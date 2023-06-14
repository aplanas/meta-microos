SUMMARY = "LXDE Office"
DESCRIPTION = "LXDE Office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-lxde-lxde_office-20170319-3.5.aarch64.rpm"
RPM_HASH = "d77c584a771ceb6933de5bce05597c2846940dcd7b7b46809db991f78ed6cc975fea986f78987b4311363910bebc9e292979e0a926dafbbf59e7b7aabbffeff6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-lxde-lxde-office"

RDEPENDS:${PN} += "pattern-"

inherit rpm
