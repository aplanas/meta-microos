SUMMARY = "Perl DES encryption module"
DESCRIPTION = "The module implements the Crypt::CBC interface, which has the following \
methods \
 \
* blocksize \
  =item keysize \
  =item encrypt \
  =item decrypt"
LICENSE = "BSD-3-Clause"

PV = "2.07"

RPM_NAME = "perl-Crypt-DES-2.07-5.38.aarch64.rpm"
RPM_HASH = "adac3dfe347c5e18a505e484e3c86ad91fc97964d95717a169bea84d10e4fb6cccf6d2c55282dc69134fdad3aa416ba48152474d2d69d8162f36c2fdcc132d81"

RPROVIDES:${PN} += "perl-Crypt--DES \
perl-Crypt-DES"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
