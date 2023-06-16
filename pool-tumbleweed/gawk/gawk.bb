SUMMARY = "Domain-specific language for text processing"
DESCRIPTION = "AWK is a domain-specific language designed for text processing and \
typically used as a data extraction and reporting tool. \
 \
GNU awk is upwardly compatible with the System V Release 4 awk.  It is \
almost completely POSIX 1003.2 compliant."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.2"

RPM_NAME = "gawk-5.2.2-2.1.aarch64.rpm"
RPM_HASH = "a8422fd25c0a3a237067b07323fdbd5e074047b0237780673a9420d961b599e2eb88785b752289f4b0aee453a673fda9f10312c5ed0bb33ce84e66ebde854498"

RPROVIDES:${PN} += "/usr/bin/awk \
/usr/bin/gawk \
awk \
config-gawk \
gawk"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libreadline.so.8"

inherit rpm
