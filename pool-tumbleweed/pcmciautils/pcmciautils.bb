SUMMARY = "Utilities for PC-Cards"
DESCRIPTION = "This package enables the usage of PC-Cards with Linux. It provides \
hotplug scripts, and tools that set up sockets and cards. Since kernel \
2.6.13 card injection and removal are handled completely via hotplug. \
Therefore, a daemon like 'cardmgr' is no longer needed. Soft ejecting \
and inserting cards can be done with pccardctl (it was cardctl before). \
There are also some tools for debugging and CIS handling."
LICENSE = "GPL-2.0-or-later"

PV = "018"

RPM_NAME = "pcmciautils-018-3.7.aarch64.rpm"
RPM_HASH = "77982bfb150e031d69eb2a07a835c08e74d7335fac7002f379a070ba05a75a87397260e0d8db9e43e8af2acbccf3c8337941ee1b5bc919f7653ea7e7f891ec94"

RPROVIDES:${PN} += "config-pcmciautils \
firmware-E-CARD.cis \
pcmcia \
pcmciautils"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libsysfs.so.2 \
permissions"

inherit rpm
