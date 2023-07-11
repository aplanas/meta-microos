SUMMARY = "CNS11643 input method for IBus framework"
DESCRIPTION = "ibus-table-cns11643 provides CNS11643 input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-cns11643-1.3.16-1.1.noarch.rpm"
RPM_HASH = "d425a524c2684e90069ad29b9e7561fd616fe347eda132f94c8329e5af06bed39d813f011ac971f7569b3bef9127c31bb48acbb66f8f6ce7c10bca0bf28053d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cns11643"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
