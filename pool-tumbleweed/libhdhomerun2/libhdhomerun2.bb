SUMMARY = "HDHomeRun library"
DESCRIPTION = "HDHomeRun configuration library allows you to discover HDHomeRun ATSC/QAM/DVB \
TV tuners on the network. It can configure the tuners, scan for channels, and \
retrieve information, including signal strength. A shared library is included \
for linking by client applications and a simple console application is included \
for scripting."
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "libhdhomerun2-20190621-1.19.aarch64.rpm"
RPM_HASH = "5c2d33ecf443a7eab4c825ccca8041072abf4d9602b8cf50da195ba0bc979a6d3035e5ea0df928d31d252293df11b309212ec587a6ea477c6befa5c687ea8452"

RPROVIDES:${PN} += "libhdhomerun.so.2 \
libhdhomerun2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
