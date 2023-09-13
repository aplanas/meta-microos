SUMMARY = "Print lines matching a pattern"
DESCRIPTION = "The grep command searches one or more input files for lines containing a \
match to a specified pattern.  By default, grep prints the matching lines."
LICENSE = "GPL-3.0-or-later"

PV = "3.11"

RPM_NAME = "grep-3.11-2.1.aarch64.rpm"
RPM_HASH = "c1abf0ccd75cb1d67df3715a58619123b12ad5eb95867586c044c9bd9ac001abeb95777e91d83a1a07c87791efb43a9f05475629163b266867c43a42ff069e31"

RPROVIDES:${PN} += "/usr/bin/grep \
base-/usr/bin/grep \
grep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
