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

RPM_NAME = "perl-Sereal-Encoder-5.004-1.2.aarch64.rpm"
RPM_HASH = "aaf41c7cb7f15543dd9010351eb2ea272d131fa13c3bd9c43235dc3e03fdbb43b76b4b5c1851970fbe2e5f8323a974ab627ba7bc17398916ba51e0fc72bf2611"

RPROVIDES:${PN} += "perl-Sereal--Encoder \
perl-Sereal--Encoder--Constants \
perl-Sereal-Encoder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Sereal--Decoder"

inherit rpm
