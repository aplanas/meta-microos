SUMMARY = "Binary serialization module for Perl"
DESCRIPTION = "_Sereal_ is an efficient, compact-output, binary and feature-rich \
serialization protocol. The Perl encoder is implemented as the \
Sereal::Encoder module, the Perl decoder correspondingly as \
Sereal::Decoder. They are distributed separately to allow for safe \
upgrading without downtime. (Hint: Upgrade the decoder everywhere first, \
then the encoder.) \
 \
This 'Sereal' module is a very thin wrapper around both 'Sereal::Encoder' \
and 'Sereal::Decoder'. It depends on both and loads both. So if you have a \
user of both encoder and decoder, it is enough to depend on a particular \
version of 'Sereal' and you'll get the most recent released versions of \
'Sereal::Encoder' and 'Sereal::Decoder' whose version is smaller than or \
equal to the version of 'Sereal' you depend on. \
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

RPM_NAME = "perl-Sereal-5.004-1.1.noarch.rpm"
RPM_HASH = "b87872aab6ef550204962421f92050285b1edf0a867731653baf4532da37081c084779619544d236d76251d79bec3ac6fb579ca3b6afb75add16365eb12cfa1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sereal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Sereal--Decoder \
perl-Sereal--Encoder"

inherit rpm
