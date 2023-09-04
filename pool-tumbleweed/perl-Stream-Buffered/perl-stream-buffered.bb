SUMMARY = "temporary buffer to save bytes"
DESCRIPTION = "Stream::Buffered is a buffer class to store arbitrary length of byte \
strings and then get a seekable filehandle once everything is buffered. It \
uses PerlIO and/or temporary file to save the buffer depending on the \
length of the size."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Stream-Buffered-0.03-1.29.noarch.rpm"
RPM_HASH = "e5527ff0f021060c3884feebabdbb745bfc05a5091826b9e7f132311c4cf278cf2833e813ad163ee6068d527a12bbabfa2a89940dda8518a0cbe4c4f786a71c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Stream--Buffered \
perl-Stream--Buffered--Auto \
perl-Stream--Buffered--File \
perl-Stream--Buffered--PerlIO \
perl-Stream-Buffered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--File"

inherit rpm
