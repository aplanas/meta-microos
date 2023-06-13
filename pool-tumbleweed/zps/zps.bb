SUMMARY = "Utility for listing and reaping zombie processes"
DESCRIPTION = "zps aims to list the running processes at a particular time with stats and indicate \
the zombie processes on this list. It can also reap these zombie processes automatically \
if `--reap` argument is provided. There's also `--lreap` argument for reaping zombie \
processes after listing."
LICENSE = "GPL-3.0-only"

PV = "1.2.8"

RPM_NAME = "zps-1.2.8-1.3.aarch64.rpm"
RPM_HASH = "2035650285f767f1c009ed2250341ac98127b96af8139d2e077e6063e47c3e1446469cd2db74c309b8d3c0b3ca029ce52da26ab29ac71adf4af2454b4525a8fa"

RPROVIDES:${PN} += "application() \
application(zps.desktop) \
zps \
zps(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
