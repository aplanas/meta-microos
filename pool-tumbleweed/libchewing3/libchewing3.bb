SUMMARY = "Chewing libraries"
DESCRIPTION = "This package contains libraries for Chewing, an intelligent phonetic \
input method library for traditional Chinese."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "libchewing3-0.5.1+git20200627.452f622-1.10.aarch64.rpm"
RPM_HASH = "bcc2b94915c6271fbb3c1f6fecf7688901cc581a9d0c76747bd8f598b8146214eaa4ca0d9d306276f1a451c92dac59f2abaf99c1f7afb760aa1ab8d79f9eedbc"

RPROVIDES:${PN} += "libchewing.so.3 \
libchewing3"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
chewing-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
