SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack0-1.9.22-2.2.aarch64.rpm"
RPM_HASH = "5ab5928b2f0b5c4b55295cff79546ed985d0a08a43b6ba79be70fb8190c8de116f352ebd66a28b197a000ba4bb56d76d2c91387d5d08e6b7ef68061b442aade3"

RPROVIDES:${PN} += "libjack \
libjack.so.0 \
libjack0 \
libjack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
