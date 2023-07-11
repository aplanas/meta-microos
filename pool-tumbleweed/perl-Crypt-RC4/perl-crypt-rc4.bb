SUMMARY = "Perl implementation of the RC4 encryption algorithm"
DESCRIPTION = "A simple implementation of the RC4 algorithm, developed by RSA Security, Inc. \
Here is the description from RSA's website: \
 \
RC4 is a stream cipher designed by Rivest for RSA Data Security (now RSA \
Security). It is a variable key-size stream cipher with byte-oriented \
operations. The algorithm is based on the use of a random permutation. Analysis \
shows that the period of the cipher is overwhelmingly likely to be greater than \
10100. Eight to sixteen machine operations are required per output byte, and \
the cipher can be expected to run very quickly in software. Independent \
analysts have scrutinized the algorithm and it is considered secure."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2.02"

RPM_NAME = "perl-Crypt-RC4-2.02-13.30.aarch64.rpm"
RPM_HASH = "ddc0dbef7da5ff1dbd89c174314260bcc20373b225f4d07d2609604f00cfdb78108fe6d2ee9d496dcea62f91cc1413fe03c6126efa2f0d0e7ef0e3b6392b55d2"

RPROVIDES:${PN} += "perl-Crypt--RC4 \
perl-Crypt-RC4"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
