SUMMARY = "Parse HTTP/1.1 request into HTTP::Request/Response object"
DESCRIPTION = "This is an HTTP request parser. It takes chunks of text as received and \
returns a 'hint' as to what is required, or returns the HTTP::Request when \
a complete request has been read. HTTP/1.1 chunking is supported. It dies \
if it finds an error."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-HTTP-Parser-0.06-1.11.noarch.rpm"
RPM_HASH = "10ee273c754dff08b61274764261147f7ebf678a463d2cb4a01948c4ed4be28436985c8bd592f71ded70d90517af973c82f6ef1b66ec32357974a251e7a23be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Parser \
perl-HTTP-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Request \
perl-HTTP--Response \
perl-URI"

inherit rpm
