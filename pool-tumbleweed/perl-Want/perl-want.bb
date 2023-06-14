SUMMARY = "Generalisation of C<Wantarray>"
DESCRIPTION = "This module generalises the mechanism of the *wantarray* function, allowing \
a function to determine in some detail how its return value is going to be \
immediately used."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.29"

RPM_NAME = "perl-Want-0.29-1.34.aarch64.rpm"
RPM_HASH = "1ee157dbd1e11b7550170df42000b854bbb9f8e69001e0bf21a021db21421834f7ae2bc568c2d11c65c3bb3bb594907139af3f5036a583e1c0b73db8d20606ac"

RPROVIDES:${PN} += "perl-Want"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
