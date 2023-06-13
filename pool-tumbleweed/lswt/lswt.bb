SUMMARY = "Wayland toplevel lister"
DESCRIPTION = "A program to list Wayland toplevels. \
 \
Requires the Wayland server to implement the foreign-toplevel-management-unstable-v1 \
protocol extension."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "lswt-1.0.4-2.6.aarch64.rpm"
RPM_HASH = "b7b9ae404a400363e5cbb599faf65a78655032cb2cfad40ab77bc584001e627189ce3e76465cf906e36fc75db092e860df3856e4dcebf41b32effeed9bcd5118"

RPROVIDES:${PN} += "lswt \
lswt(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
