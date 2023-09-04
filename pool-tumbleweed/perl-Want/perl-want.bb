SUMMARY = "Generalisation of C<Wantarray>"
DESCRIPTION = "This module generalises the mechanism of the *wantarray* function, allowing \
a function to determine in some detail how its return value is going to be \
immediately used."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.29"

RPM_NAME = "perl-Want-0.29-1.36.aarch64.rpm"
RPM_HASH = "dd8fff7aa2295f5c4ba43466b9a1dc1a93124eb137831762d100af75b604d566004c7b85af007c5fcfcfcbc8514b8240da2ea30ef3725ec06bd66552bb3c870d"

RPROVIDES:${PN} += "perl-Want"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
