SUMMARY = "A Program for Printing Calendars"
DESCRIPTION = "Gcal is a program for printing calendars.  Gcal displays a calendar for \
a month or a year, eternal holiday lists, and fixed date lists.  The \
program correctly omits the dates that were skipped when the current \
Gregorian calendar replaced the earlier Julian calendar."
LICENSE = "GPL-3.0-or-later"

PV = "4.1"

RPM_NAME = "gcal-4.1-3.5.aarch64.rpm"
RPM_HASH = "9101a24da6df43c3d1461fea8fc22a0edf0f70fd3339658e853df46f3c11b595fcb738b83493c70d0f258384a9f269c597b643b79934d1b0e26a3c4c93f41c57"

RPROVIDES:${PN} += "gcal"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
