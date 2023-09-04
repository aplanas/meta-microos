SUMMARY = "Lightweight HTTP implementation"
DESCRIPTION = "*Note:* you should look at the HTTP::Tiny manpage or the LWP manpage before \
using this module. \
 \
HTTP::Lite is a stand-alone lightweight HTTP/1.1 implementation for perl. \
It is not intended as a replacement for the fully-featured LWP module. \
Instead, it is intended for use in situations where it is desirable to \
install the minimal number of modules to achieve HTTP support, or where LWP \
is not a good candidate due to CPU overhead, such as slower processors. \
HTTP::Lite is also significantly faster than LWP. \
 \
HTTP::Lite is ideal for CGI (or mod_perl) programs or for bundling for \
redistribution with larger packages where only HTTP GET and POST \
functionality are necessary. \
 \
HTTP::Lite supports basic POST and GET operations only. As of 0.2.1, \
HTTP::Lite supports HTTP/1.1 and is compliant with the Host header, \
necessary for name based virtual hosting. Additionally, HTTP::Lite now \
supports Proxies. \
 \
As of 2.0.0 HTTP::Lite now supports a callback to allow processing of \
request data as it arrives. This is useful for handling very large files \
without consuming memory. \
 \
If you require more functionality, such as FTP or HTTPS, please see \
libwwwperl (LWP). LWP is a significantly better and more comprehensive \
package than HTTP::Lite, and should be used instead of HTTP::Lite whenever \
possible."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.44"

RPM_NAME = "perl-HTTP-Lite-2.44-1.28.noarch.rpm"
RPM_HASH = "73c8ded7a966017d68e7a91931e7dec901722efb0df21b2b1ae4d7cc533ecd0e9e35ae786642c984145f0b7298200cf8d6cbce3a6085d39a7763e10d642e06e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Lite \
perl-HTTP-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
