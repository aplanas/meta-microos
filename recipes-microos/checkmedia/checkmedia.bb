SUMMARY = "Check SUSE installation media"
DESCRIPTION = "The program checks SUSE installation media for errors."
LICENSE = "GPL-3.0-or-later"

PV = "6.1"

RPM_NAME = "checkmedia-6.1-2.7.aarch64.rpm"
RPM_HASH = "d79ebff1178b2ecc32a55a86868e504cf85c64946d02446712c9b1db7589f44f598554b8738add9335006330d5d3f1cd1d0b6babf537014383e80286536cd7fd"

RPROVIDES:${PN} += "checkmedia checkmedia(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl libc.so.6(GLIBC_2.34)(64bit) libmediacheck.so.6()(64bit)"

inherit rpm
