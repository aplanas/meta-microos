SUMMARY = "CNS11643 input method for IBus framework"
DESCRIPTION = "ibus-table-cns11643 provides CNS11643 input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-cns11643-1.3.13-2.3.noarch.rpm"
RPM_HASH = "71c177f6feb8fa2a1b2dda7f16370b5fdd55a2ef4c5ee1bde391e14af42417522bed1c93df2659f813f0559eadeb62b1fe6e0395f3da0863e3aa16ba9b3e6f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cns11643"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
