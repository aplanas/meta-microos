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

RPM_NAME = "perl-Encode-Detect-1.01-21.37.aarch64.rpm"
RPM_HASH = "a8ca4f91587322369f4e0afc09dbfd23d67a1425be7b1b073854f080eb5e085b3e5211d594f122237ae2304908d832859149df214e3caac668f6d45a7b3441e7"

RPROVIDES:${PN} += "perl-Encode--Detect \
perl-Encode--Detect--Detector \
perl-Encode-Detect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
