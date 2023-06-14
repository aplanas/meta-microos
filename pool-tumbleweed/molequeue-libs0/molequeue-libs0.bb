SUMMARY = "Shared and private libraries of molequeue"
DESCRIPTION = "Shared and private libraries of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-libs0-0.9.0-3.9.aarch64.rpm"
RPM_HASH = "a8e1cb14eb661c17eae9c798bc2f8429499196f918a650aabe87cb91b988016985cf9e158e905015676190054c8142a24372e7e4f5e752d8e314c06c43058f9b"

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
