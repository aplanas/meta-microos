SUMMARY = "Development package for baloo5-widgets"
DESCRIPTION = "Development package for baloo5-widgets"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "baloo5-widgets-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0cf6bce92b6ea462749ef1122f618de54744e0191822f10946395e17fe1ef97e94be32d7ffa803926d09dd4fbbbc2ea7ec2a6714f243e5cc94e755be672c02ac"

RPROVIDES:${PN} += "baloo-widgets5-devel baloo5-widgets-devel baloo5-widgets-devel(aarch-64) cmake(KF5BalooWidgets)"
RDEPENDS:${PN} += "baloo5-widgets cmake(KF5KIO) cmake(Qt5Widgets)"

inherit rpm
