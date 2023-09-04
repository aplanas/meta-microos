SUMMARY = "Unified interface to MIME encoding and decoding"
DESCRIPTION = "This module simply wraps 'MIME::Base64' and 'MIME::QuotedPrint' so that you \
can throw the contents of a 'Content-Transfer-Encoding' header at some text \
and have the right thing happen. \
 \
'MIME::Base64', 'MIME::QuotedPrint', 'Email::MIME'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.317"

RPM_NAME = "perl-Email-MIME-Encodings-1.317-1.4.noarch.rpm"
RPM_HASH = "b75e2b44cbe02e56e0c3c84cdca6b6bfd4d67a4860184388c39ad5518a15e9b517389e7c0c09b2d20018cc0a6ecb817de349480d17542e0b17aff68bb1fe2e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME--Encodings \
perl-Email-MIME-Encodings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
