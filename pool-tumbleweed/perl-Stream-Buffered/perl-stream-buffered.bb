SUMMARY = "temporary buffer to save bytes"
DESCRIPTION = "Stream::Buffered is a buffer class to store arbitrary length of byte \
strings and then get a seekable filehandle once everything is buffered. It \
uses PerlIO and/or temporary file to save the buffer depending on the \
length of the size."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Stream-Buffered-0.03-1.28.noarch.rpm"
RPM_HASH = "83ee7a1800649f2c2d99b0de0835d1ccb7b6bfeda1ba93ad09288ed7d581dead7397d3ead32c3c6cfba92c3b2b5ac03e006cff212d8951edc8dbf69b05d1f4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Stream--Buffered \
perl-Stream--Buffered--Auto \
perl-Stream--Buffered--File \
perl-Stream--Buffered--PerlIO \
perl-Stream-Buffered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--File"

inherit rpm
