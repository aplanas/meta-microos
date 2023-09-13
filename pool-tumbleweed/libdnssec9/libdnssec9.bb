SUMMARY = "DNSSEC support functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for DNSSEC support functions."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "libdnssec9-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "ae9b136b0367adca925e9f7e4dd0ddaa665a68cdaf3575b011666361162b37ba35a83a1aa6e0ad68db1488f29d4deb2003321ef3c791d5b2cbe58a69a53dcc4f"

RPROVIDES:${PN} += "libdnssec.so.9 \
libdnssec9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm
