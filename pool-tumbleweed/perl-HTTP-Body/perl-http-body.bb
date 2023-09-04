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

RPM_NAME = "perl-HTTP-Body-1.22-1.28.noarch.rpm"
RPM_HASH = "7f04080970349a03cea24031c386914f2aca844fd394536b5c0fc5f697de5f1f39bf97f6b99666f24d0a13a722815e5de12cc763296c51b86eab2280a4e87351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Body \
perl-HTTP--Body--MultiPart \
perl-HTTP--Body--OctetStream \
perl-HTTP--Body--UrlEncoded \
perl-HTTP--Body--XForms \
perl-HTTP--Body--XFormsMultipart \
perl-HTTP-Body"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Headers \
perl-IO--File"

inherit rpm
