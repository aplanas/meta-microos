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

RPM_NAME = "perl-Sereal-Decoder-5.004-1.1.aarch64.rpm"
RPM_HASH = "b7ae2c4656ca10263119986d4164a7d20b469f64987a0674ae8985c0575659b4994a5a0c184fe9c1d516444afdf026660738b073463e757db161455b4033f609"

RPROVIDES:${PN} += "perl(Sereal::Decoder) \
perl(Sereal::Decoder::Constants) \
perl(Sereal::Performance) \
perl-Sereal-Decoder \
perl-Sereal-Decoder(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
