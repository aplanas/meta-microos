SUMMARY = "choose a variant to serve"
DESCRIPTION = "This module provides a complete implementation of the HTTP content \
negotiation algorithm specified in _draft-ietf-http-v11-spec-00.ps_ chapter \
12. Content negotiation allows for the selection of a preferred content \
representation based upon attributes of the negotiable variants and the \
value of the various Accept* header fields in the request. \
 \
The variants are ordered by preference by calling the function choose(). \
 \
The first parameter is reference to an array of the variants to choose \
among. Each element in this array is an array with the values [$id, $qs, \
$content_type, $content_encoding, $charset, $content_language, \
$content_length] whose meanings are described below. The $content_encoding \
and $content_language can be either a single scalar value or an array \
reference if there are several values. \
 \
The second optional parameter is either a HTTP::Headers or a HTTP::Request \
object which is searched for 'Accept*' headers. If this parameter is \
missing, then the accept specification is initialized from the CGI \
environment variables HTTP_ACCEPT, HTTP_ACCEPT_CHARSET, \
HTTP_ACCEPT_ENCODING and HTTP_ACCEPT_LANGUAGE. \
 \
In an array context, choose() returns a list of [variant identifier, \
calculated quality, size] tuples. The values are sorted by quality, highest \
quality first. If the calculated quality is the same for two variants, then \
they are sorted by size (smallest first). _E.g._: \
 \
  (['var1', 1, 2000], ['var2', 0.3, 512], ['var3', 0.3, 1024]); \
 \
Note that also zero quality variants are included in the return list even \
if these should never be served to the client. \
 \
In a scalar context, it returns the identifier of the variant with the \
highest score or 'undef' if none have non-zero quality. \
 \
If the $HTTP::Negotiate::DEBUG variable is set to TRUE, then a lot of noise \
is generated on STDOUT during evaluation of choose()."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "6.01"

RPM_NAME = "perl-HTTP-Negotiate-6.01-9.27.noarch.rpm"
RPM_HASH = "4502ceaca0d4d56f77a781f7d80ee43796160a5c77954cccedbc7945d4641320de53910a21a8568dfeab56ed869a5a2d74ac74d55423fe9048e92fc2a284b1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Negotiate \
perl-HTTP-Negotiate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Headers"

inherit rpm
