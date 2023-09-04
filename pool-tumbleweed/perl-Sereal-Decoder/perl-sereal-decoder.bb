SUMMARY = "Binary serialization module for Perl (decoder part)"
DESCRIPTION = "This library implements a deserializer for an efficient, compact-output, \
and feature-rich binary protocol called _Sereal_. Its sister module \
Sereal::Encoder implements an encoder for this format. The two are released \
separately to allow for independent and safer upgrading. \
 \
The Sereal protocol versions that are compatible with this decoder \
implementation are currently protocol versions 1, 2, 3 and 4. As it stands, \
it will refuse to attempt to decode future versions of the protocol, but if \
necessary there is likely going to be an option to decode the parts of the \
input that are compatible with version 4 of the protocol. The protocol was \
designed to allow for this. \
 \
The protocol specification and many other bits of documentation can be \
found in the github repository. Right now, the specification is at \
https://github.com/Sereal/Sereal/blob/master/sereal_spec.pod, there is a \
discussion of the design objectives in \
https://github.com/Sereal/Sereal/blob/master/README.pod, and the output of \
our benchmarks can be seen at \
https://github.com/Sereal/Sereal/wiki/Sereal-Comparison-Graphs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.004"

RPM_NAME = "perl-Sereal-Decoder-5.004-1.3.aarch64.rpm"
RPM_HASH = "1896d4add5426ebc7a8adc2ba6007eb0439d8cdd3cd9f9866277b21d27331acfc9a7b4ae102f28bdfec27bdd99b8a5b528fab56db75291b34a47f798fca8e432"

RPROVIDES:${PN} += "perl-Sereal--Decoder \
perl-Sereal--Decoder--Constants \
perl-Sereal--Performance \
perl-Sereal-Decoder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
