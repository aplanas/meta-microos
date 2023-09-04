SUMMARY = "Parse HTTP/1.1 request into HTTP::Request/Response object"
DESCRIPTION = "This is an HTTP request parser. It takes chunks of text as received and \
returns a 'hint' as to what is required, or returns the HTTP::Request when \
a complete request has been read. HTTP/1.1 chunking is supported. It dies \
if it finds an error."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-HTTP-Parser-0.06-1.12.noarch.rpm"
RPM_HASH = "1673a89aa77bfb893f40694251b77fd2fe9d5144235ef4f3047fbf91135e8dfbb00115b01043191012686bfb327d78392e6b1f21423db06dfb7fb4c25e2392d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Parser \
perl-HTTP-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Request \
perl-HTTP--Response \
perl-URI"

inherit rpm
