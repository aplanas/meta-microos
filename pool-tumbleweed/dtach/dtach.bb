SUMMARY = "Background processes and reattach to them"
DESCRIPTION = "dtach wraps a command in a sort of process container with new \
terminal device and session, allowing to 'detach' from it, \
essentially backgrounding the process, and later re-attach to it, \
similar to the eponymous feature of GNU screen. \
 \
dtach avoids interpreting most of the input and output between attached \
terminals and the program under its control. Though multi display mode (like \
screen -x) is available, different terminal types or even sizes are not \
handled."
LICENSE = "GPL-2.0-or-later"

PV = "0.9+2.748020b"

RPM_NAME = "dtach-0.9+2.748020b-1.6.aarch64.rpm"
RPM_HASH = "90f70e0b171924ac6931eb5bf8e0b0e8b3f742e90f51d2dea05a371382765741c578cc7f4bf92f91aa2684ff3c577d17b92173a01304ac6097814042e6ecdd95"

RPROVIDES:${PN} += "dtach \
dtach(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
