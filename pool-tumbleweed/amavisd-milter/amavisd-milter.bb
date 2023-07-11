SUMMARY = "Sendmail milter for amavisd-new using the AM.PDP protocol"
DESCRIPTION = "The amavisd-milter is a sendmail milter (mail filter) for amavisd-new \
2.4.3 (and above) and sendmail 8.12 (and above) which use the new AM.PDP \
protocol."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "amavisd-milter-1.7.2-1.8.aarch64.rpm"
RPM_HASH = "c5824ae91fcd5b5deaa516359b5dfddf7f26640e4d7e85c17e01eb0f6a7339e05c03a5d7b1203971bfcfa94c8accabaf6abd696307ee60470f1fd0c399f25bf8"

RPROVIDES:${PN} += "amavisd-milter"

RDEPENDS:${PN} += "/usr/bin/sh \
amavisd-new \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmilter.so.1.0"

inherit rpm
