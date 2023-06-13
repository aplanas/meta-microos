SUMMARY = "ChaSen Perl Module"
DESCRIPTION = "ChaSen Perl Module"
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "perl-Text-ChaSen-2.4.5-2.11.aarch64.rpm"
RPM_HASH = "e6af47be07822349c55d9fe346c97573fb476124999c4013db9e42e970cc35a7d2380c6c0e8e073b7448d310554c323ec0b7fd4d595f49d38f4a0381db4b8af6"

RPROVIDES:${PN} += "chasen-perl \
perl(Text::ChaSen) \
perl-Text-ChaSen \
perl-Text-ChaSen(aarch-64)"

RDEPENDS:${PN} += "chasen \
libc.so.6(GLIBC_2.17)(64bit) \
perl"

inherit rpm
