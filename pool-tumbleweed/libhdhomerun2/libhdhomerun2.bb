SUMMARY = "HDHomeRun library"
DESCRIPTION = "HDHomeRun configuration library allows you to discover HDHomeRun ATSC/QAM/DVB \
TV tuners on the network. It can configure the tuners, scan for channels, and \
retrieve information, including signal strength. A shared library is included \
for linking by client applications and a simple console application is included \
for scripting."
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "libhdhomerun2-20190621-1.18.aarch64.rpm"
RPM_HASH = "3a2f97763d7f88be3a50216e42391fe0db37aecb9c4db5a552a63bec8561d27e83482b783b23ac0a9127c4db677b7595c3900a8e222fc3369ceb23a09765e3d0"

RPROVIDES:${PN} += "libhdhomerun.so.2()(64bit) \
libhdhomerun2 \
libhdhomerun2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
