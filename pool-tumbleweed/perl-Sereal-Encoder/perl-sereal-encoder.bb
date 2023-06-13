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

RPM_NAME = "perl-Sereal-Encoder-5.004-1.1.aarch64.rpm"
RPM_HASH = "b8dea51240a1a711b37c2a48ca5169d59a1e26213a26d396d5bf5ffcb5fbf875959e3850b32180631173c40d2d0f785424ef67d3b75525b339f24a7613c56fe1"

RPROVIDES:${PN} += "perl(Sereal::Encoder) \
perl(Sereal::Encoder::Constants) \
perl-Sereal-Encoder \
perl-Sereal-Encoder(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Sereal::Decoder)"

inherit rpm
