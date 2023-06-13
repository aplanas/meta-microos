SUMMARY = "Utilities for PC-Cards"
DESCRIPTION = "This package enables the usage of PC-Cards with Linux. It provides \
hotplug scripts, and tools that set up sockets and cards. Since kernel \
2.6.13 card injection and removal are handled completely via hotplug. \
Therefore, a daemon like 'cardmgr' is no longer needed. Soft ejecting \
and inserting cards can be done with pccardctl (it was cardctl before). \
There are also some tools for debugging and CIS handling."
LICENSE = "GPL-2.0-or-later"

PV = "018"

RPM_NAME = "pcmciautils-018-3.6.aarch64.rpm"
RPM_HASH = "26703d17ef7cc9c7cfcf72117658a55cf5a43fb87cd09fdd18733478befc60543a93e7a23e482b7a932e0074c32a1b319459b1736dfb23174a2522e9c65d433c"

RPROVIDES:${PN} += "config(pcmciautils) \
firmware(E-CARD.cis) \
pcmcia \
pcmciautils \
pcmciautils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
libsysfs.so.2()(64bit) \
permissions"

inherit rpm
