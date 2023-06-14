SUMMARY = "Raku (formerly Perl 6) implemenation that runs on MoarVM"
DESCRIPTION = "The most mature, production-ready implementation of the Raku language."
LICENSE = "Artistic-2.0"

PV = "2022.07"

RPM_NAME = "rakudo-2022.07-2.3.aarch64.rpm"
RPM_HASH = "26d95a004ebd65d90e4f270535b064499f4dc5e1598ccb00d01df93af828b0770206543d28182b2d7da7a696c7e1cae4de02c3f33061fe0e4607c761297cd1e2"

RPROVIDES:${PN} += "libperl6-ops-moar.so \
perl6 \
rakudo"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmoar.so \
moarvm \
nqp"

inherit rpm
