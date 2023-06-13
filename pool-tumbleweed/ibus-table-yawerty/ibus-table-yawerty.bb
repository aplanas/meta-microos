SUMMARY = "Yawerty input method for IBus framework"
DESCRIPTION = "ibus-table-yawerty provides Yawerty input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-yawerty-1.3.13-2.3.noarch.rpm"
RPM_HASH = "3a69abe6972dfdd868d837ed87206bd0bef22ba58759b76ace2f3ee3a075af59b932feb520363b6b8510f7f406d172d68ef4ecf11e1ea878c78b4f14ff884e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-yawerty"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
