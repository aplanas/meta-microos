SUMMARY = "Binary serialization module for Perl (encoder part)"
DESCRIPTION = "This library implements an efficient, compact-output, and feature-rich \
serializer using a binary protocol called _Sereal_. Its sister module \
Sereal::Decoder implements a decoder for this format. The two are released \
separately to allow for independent and safer upgrading. If you care \
greatly about performance, consider reading the Sereal::Performance \
documentation after finishing this document. \
 \
The Sereal protocol version emitted by this encoder implementation is \
currently protocol version 4 by default. \
 \
The protocol specification and many other bits of documentation can be \
found in the github repository. Right now, the specification is at \
https://github.com/Sereal/Sereal/blob/master/sereal_spec.pod, there is a \
discussion of the design objectives in \
https://github.com/Sereal/Sereal/blob/master/README.pod, and the output of \
our benchmarks can be seen at \
https://github.com/Sereal/Sereal/wiki/Sereal-Comparison-Graphs. For more \
information on getting the best performance out of Sereal, have a look at \
the 'PERFORMANCE' section below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.004"

RPM_NAME = "perl-Sereal-Encoder-5.004-1.3.aarch64.rpm"
RPM_HASH = "9549dcff7bd0ab8a014cc41d089d2c394b646c530cb3e92d730f085e6a755fbb9f8de640675c1ebb9e70995b5bb579823b3cc0dc28f2541078c066b1a56ac168"

RPROVIDES:${PN} += "perl-Sereal--Encoder \
perl-Sereal--Encoder--Constants \
perl-Sereal-Encoder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Sereal--Decoder"

inherit rpm
