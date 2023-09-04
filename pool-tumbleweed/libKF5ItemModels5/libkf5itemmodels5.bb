SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ItemModels5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "4eb041dbb853fd610988b3f6f18c31248498180ff03a5f5a2a85951b86842e62d7c4ddf65543d1428d71efb8246a576806dba83fe6f81e212267885f8fab4291"

RPROVIDES:${PN} += "libKF5ItemModels.so.5 \
libKF5ItemModels5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
