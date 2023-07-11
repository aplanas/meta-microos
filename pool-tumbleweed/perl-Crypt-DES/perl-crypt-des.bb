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

RPM_NAME = "perl-Crypt-DES-2.07-5.37.aarch64.rpm"
RPM_HASH = "4e57a80c522370feece0f814244a8e32c0970ade4161a20aa560f15127731c208f09afab0c82db42c80dae0168b47f8653f1b816f0402bd49dad79efa0081a88"

RPROVIDES:${PN} += "perl-Crypt--DES \
perl-Crypt-DES"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
