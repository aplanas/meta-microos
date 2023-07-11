SUMMARY = "HTTP Body Parser"
DESCRIPTION = "HTTP::Body parses chunks of HTTP POST data and supports \
application/octet-stream, application/json, \
application/x-www-form-urlencoded, and multipart/form-data. \
 \
Chunked bodies are supported by not passing a length value to new(). \
 \
It is currently used by the Catalyst manpage to parse POST bodies."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.22"

RPM_NAME = "perl-HTTP-Body-1.22-1.27.noarch.rpm"
RPM_HASH = "8d1ebb0d40301750816b51593351802b6f6ae45009537ee99d5ff29e57f70220933042162594b4e0ac353321828832684e1f114a30ef8963cd2d299112b5c2f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Body \
perl-HTTP--Body--MultiPart \
perl-HTTP--Body--OctetStream \
perl-HTTP--Body--UrlEncoded \
perl-HTTP--Body--XForms \
perl-HTTP--Body--XFormsMultipart \
perl-HTTP-Body"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Headers \
perl-IO--File"

inherit rpm
