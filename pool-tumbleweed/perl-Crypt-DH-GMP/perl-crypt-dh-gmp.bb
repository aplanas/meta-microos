SUMMARY = "Crypt::DH Using GMP Directly"
DESCRIPTION = "Crypt::DH::GMP is a (somewhat) portable replacement to Crypt::DH, \
implemented mostly in C."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.00012"

RPM_NAME = "perl-Crypt-DH-GMP-0.00012-4.31.aarch64.rpm"
RPM_HASH = "83393ca94c65a380d57fc9231e9aa2c9b1308584185cd0bf821b2d2a7e6c83a69877554b8bb512e548a599413831f38184ca007aa37ddfaedde290f9f6fc5bd9"

RPROVIDES:${PN} += "perl-Crypt--DH--GMP \
perl-Crypt--DH--GMP--Compat \
perl-Crypt-DH-GMP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
