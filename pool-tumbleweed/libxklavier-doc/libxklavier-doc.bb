SUMMARY = "Additional Package Documentation for libxklavier"
DESCRIPTION = "This library allows you to simplify XKB-related development."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier-doc-5.4-1.7.aarch64.rpm"
RPM_HASH = "fce11571e1533eb157df41127fea20c9609cfa39a8821407a87370a2b3b7c798b23a573760eeee77a3475fe6ef0ff8fd071fe45aed232cb42cd480927429f72c"

RPROVIDES:${PN} += "libxklavier-doc \
libxklavier-doc(aarch-64)"

RDEPENDS:${PN} += "libxklavier"

inherit rpm
