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

RPM_NAME = "perl-Digest-JHash-0.10-1.34.aarch64.rpm"
RPM_HASH = "0022062bc64497ab7916ca31574a9f3f283df2deb8881dba37266e0af44e6c7c5ba1102819682639d338d9de789a2cf9f815dcf7ae32f10a295c433231138651"

RPROVIDES:${PN} += "perl-Digest--JHash \
perl-Digest-JHash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
