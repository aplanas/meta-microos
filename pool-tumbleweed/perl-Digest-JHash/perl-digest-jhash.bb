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

RPM_NAME = "perl-Digest-JHash-0.10-1.33.aarch64.rpm"
RPM_HASH = "0689220e9986993efdaa6d723a57fa175481464356c8d6b6fc9147a9fd3165b4ea879fed365137632ca40738b38e7705e336c3752408609a49b4a6fd65798330"

RPROVIDES:${PN} += "perl-Digest--JHash \
perl-Digest-JHash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
