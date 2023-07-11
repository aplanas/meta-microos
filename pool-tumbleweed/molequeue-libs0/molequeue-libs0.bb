SUMMARY = "Shared and private libraries of molequeue"
DESCRIPTION = "Shared and private libraries of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-libs0-0.9.0-3.10.aarch64.rpm"
RPM_HASH = "770409ea0c24974338631ab7c989c3bbdca17272462f946884adb384d7e5d7222fe179d6eca5977e7142db49f206a75c245ad0532b73477045062cbe1a77074c"

RPROVIDES:${PN} += "libMoleQueueClient.so \
libMoleQueueServerCore.so \
molequeue-libs0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
