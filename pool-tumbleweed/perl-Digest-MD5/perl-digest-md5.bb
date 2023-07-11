SUMMARY = "Perl interface to the MD5 Algorithm"
DESCRIPTION = "The 'Digest::MD5' module allows you to use the RSA Data Security Inc. MD5 \
Message Digest algorithm from within Perl programs. The algorithm takes as \
input a message of arbitrary length and produces as output a 128-bit \
'fingerprint' or 'message digest' of the input. \
 \
Note that the MD5 algorithm is not as strong as it used to be. It has since \
2005 been easy to generate different messages that produce the same MD5 \
digest. It still seems hard to generate messages that produce a given \
digest, but it is probably wise to move to stronger algorithms for \
applications that depend on the digest to uniquely identify a message. \
 \
The 'Digest::MD5' module provide a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.58"

RPM_NAME = "perl-Digest-MD5-2.58-1.16.aarch64.rpm"
RPM_HASH = "2893b3098055f3cb5e0f8592e541c14ce6249c6d93c3b06c740ca249a9bb5fdca5b2f4eccfe4bbc4b96bbe167cbd72d8b1358803a2b4e9ff547c599c083ad30e"

RPROVIDES:${PN} += "perl-Digest--MD5 \
perl-Digest-MD5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
