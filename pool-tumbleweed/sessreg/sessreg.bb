SUMMARY = "Utility to manage utmp/wtmp entries for X sessions"
DESCRIPTION = "Sessreg is a simple program for managing utmp/wtmp entries for X sessions. \
It was originally written for use with xdm, but may also be used with \
other display managers such as gdm or kdm."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "sessreg-1.1.3-1.2.aarch64.rpm"
RPM_HASH = "387ed99c1e70ffcd97382ea4b23cfdf9c0dc4add35584db5d1059612dbefa631c50e969d73cf6f2318f465509f5fdda8c5b7aeeef190e6bec566c8c73b2e7137"

RPROVIDES:${PN} += "sessreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
