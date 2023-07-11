SUMMARY = "Unified interface to MIME encoding and decoding"
DESCRIPTION = "This module simply wraps 'MIME::Base64' and 'MIME::QuotedPrint' so that you \
can throw the contents of a 'Content-Transfer-Encoding' header at some text \
and have the right thing happen. \
 \
'MIME::Base64', 'MIME::QuotedPrint', 'Email::MIME'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.317"

RPM_NAME = "perl-Email-MIME-Encodings-1.317-1.3.noarch.rpm"
RPM_HASH = "e1dde17607236ee01bb48c18b2793778cbb1483151feb0dc267c678ae13cd5f1227faeae13cfa200f85fa790c32d9ae2f2b0d2d0977bd05455c1df86753f2694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME--Encodings \
perl-Email-MIME-Encodings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
