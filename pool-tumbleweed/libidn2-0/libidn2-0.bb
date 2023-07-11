SUMMARY = "Support for Internationalized Domain Names (IDN)"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-0-2.3.4-1.4.aarch64.rpm"
RPM_HASH = "ed2a521d1abb40678b485d9b309d014564f53abdb9a9869b501671f3a03aeb86ef60f9fc092b29e2a7810d65ddbc354821a2bdaee98d08c60d04d9b301fe02c7"

RPROVIDES:${PN} += "libidn2 \
libidn2-0 \
libidn2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
