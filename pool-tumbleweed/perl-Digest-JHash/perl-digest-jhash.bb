SUMMARY = "Perl extension for 32 bit Jenkins Hashing Algorithm"
DESCRIPTION = "The 'Digest::JHash' module allows you to use the fast JHash hashing \
algorithm developed by Bob Jenkins from within Perl programs. The algorithm \
takes as input a message of arbitrary length and produces as output a \
32-bit 'message digest' of the input in the form of an unsigned long \
integer. \
 \
Call it a low calorie version of MD5 if you like. \
 \
See http://burtleburtle.net/bob/hash/doobs.html for more information."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-Digest-JHash-0.10-1.32.aarch64.rpm"
RPM_HASH = "479f44a1e0794bafe749f07922a0d8686c598fae95852005ffe4beeb0670aec203cb98b37212d490deaa8e38ede614c51a6fe2be22e97026fa31b0dedb09f8bf"

RPROVIDES:${PN} += "perl(Digest::JHash) \
perl-Digest-JHash \
perl-Digest-JHash(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
