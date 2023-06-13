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

RPM_NAME = "perl-HTTP-Lite-2.44-1.26.noarch.rpm"
RPM_HASH = "49e76ab229e8647bf68d0834dd9f0b1abc30928ae8d9dbe6e1d645a90de42f9e2ceb0006b6ba0b5e790c75d2a5c2c195c2b994b9957451edd02db8daa4b92a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Lite) \
perl-HTTP-Lite"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
