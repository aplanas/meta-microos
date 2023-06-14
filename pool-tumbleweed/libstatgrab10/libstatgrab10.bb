SUMMARY = "Library for libstatgrab"
DESCRIPTION = "Library for package libstatgrab."
LICENSE = "LGPL-2.1-or-later"

PV = "0.92.1"

RPM_NAME = "libstatgrab10-0.92.1-1.6.aarch64.rpm"
RPM_HASH = "34223de8d9a145dbb02cffe634a840f0910803c7d02008ed5bf66b9da02b2b54c8df9486d0fff4be93cbba0be9ddaf619716bf6a505eeadb7c86933fb1874db2"

RPROVIDES:${PN} += "libstatgrab.so.10 \
libstatgrab10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
