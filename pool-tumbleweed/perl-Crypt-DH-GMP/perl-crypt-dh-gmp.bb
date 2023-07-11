SUMMARY = "Crypt::DH Using GMP Directly"
DESCRIPTION = "Crypt::DH::GMP is a (somewhat) portable replacement to Crypt::DH, \
implemented mostly in C."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.00012"

RPM_NAME = "perl-Crypt-DH-GMP-0.00012-4.30.aarch64.rpm"
RPM_HASH = "b37929975cfc666d163f91e477f571b7e798a249b967137995f95f4b27f188bc90bf22f1b68c51e8142c441023e6b997a0fcc3f5cf3ee7308da8045466158b9d"

RPROVIDES:${PN} += "perl-Crypt--DH--GMP \
perl-Crypt--DH--GMP--Compat \
perl-Crypt-DH-GMP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
