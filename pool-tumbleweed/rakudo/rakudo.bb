SUMMARY = "Raku (formerly Perl 6) implemenation that runs on MoarVM"
DESCRIPTION = "The most mature, production-ready implementation of the Raku language."
LICENSE = "Artistic-2.0"

PV = "2022.07"

RPM_NAME = "rakudo-2022.07-2.4.aarch64.rpm"
RPM_HASH = "842fc6e09f33e369874433124c1bf5909599545f803f36a9d4da196dbca376b33a955d3d22094f2d95b15f1d902637d4af47256ccbfe00cdd5089607cbdd142a"

RPROVIDES:${PN} += "libperl6-ops-moar.so \
perl6 \
rakudo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmoar.so \
moarvm \
nqp"

inherit rpm
