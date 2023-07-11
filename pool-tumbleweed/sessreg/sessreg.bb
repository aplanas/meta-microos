SUMMARY = "Utility to manage utmp/wtmp entries for X sessions"
DESCRIPTION = "Sessreg is a simple program for managing utmp/wtmp entries for X sessions. \
It was originally written for use with xdm, but may also be used with \
other display managers such as gdm or kdm."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "sessreg-1.1.3-1.3.aarch64.rpm"
RPM_HASH = "4f11c10255f0d042198f1258de1f8da841fbdb108f80f1eae9a0b59fc20304d4ca80e575debf5e62c8e446995e0cb9f88ad503f91d513f1e78f59190200d0f2a"

RPROVIDES:${PN} += "sessreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
