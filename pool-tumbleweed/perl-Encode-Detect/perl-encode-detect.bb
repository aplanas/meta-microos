SUMMARY = "An Encode::Encoding subclass that detects the encoding of data"
DESCRIPTION = "This Perl module is an Encode::Encoding subclass that uses \
Encode::Detect::Detector to determine the charset of the input data and then \
decodes it using the encoder of the detected charset. \
 \
It is similar to Encode::Guess, but does not require the configuration of a set \
of expected encodings. Like Encode::Guess, it only supports decoding--it cannot \
encode. \
 \
Authors: \
-------- \
    John Gardiner Myers <jgmyers@proofpoint.com>"
LICENSE = "MPL-1.1"

PV = "1.01"

RPM_NAME = "perl-Encode-Detect-1.01-21.38.aarch64.rpm"
RPM_HASH = "6ba70151e43620f6dd974283c389686a8c83f44c5ecb78364ff577dcbae5c22db723cb59be62ea1a961a9c79db81fbc22c7e2c8a4bc482100c62fe879ed649fd"

RPROVIDES:${PN} += "perl-Encode--Detect \
perl-Encode--Detect--Detector \
perl-Encode-Detect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
