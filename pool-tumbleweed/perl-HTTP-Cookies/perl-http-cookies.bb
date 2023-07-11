SUMMARY = "HTTP cookie jars"
DESCRIPTION = "This class is for objects that represent a 'cookie jar' -- that is, a \
database of all the HTTP cookies that a given LWP::UserAgent object knows \
about. \
 \
Cookies are a general mechanism which server side connections can use to \
both store and retrieve information on the client side of the connection. \
For more information about cookies refer to at \
http://curl.haxx.se/rfc/cookie_spec.html and at \
http://www.cookiecentral.com. This module also implements the new style \
cookies described in at https://tools.ietf.org/html/rfc2965. The two \
variants of cookies are supposed to be able to coexist happily. \
 \
Instances of the class _HTTP::Cookies_ are able to store a collection of \
Set-Cookie2: and Set-Cookie: headers and are able to use this information \
to initialize Cookie-headers in _HTTP::Request_ objects. The state of a \
_HTTP::Cookies_ object can be saved in and restored from files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.10"

RPM_NAME = "perl-HTTP-Cookies-6.10-1.11.noarch.rpm"
RPM_HASH = "f84475c4c297b7e3b9173c4262394435137c197c8f22673deeda7b8f84dddd16ea544652f0dafccdf65f7dd89659fb125b4b620b4a43d9a9b4d7f53ace5b7b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Cookies \
perl-HTTP--Cookies--Microsoft \
perl-HTTP--Cookies--Netscape \
perl-HTTP-Cookies"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Date \
perl-HTTP--Headers--Util \
perl-HTTP--Request"

inherit rpm
