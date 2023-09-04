SUMMARY = "Minimalist HTTP user agent cookie jar"
DESCRIPTION = "This module implements a minimalist HTTP user agent cookie jar in \
conformance with at http://tools.ietf.org/html/rfc6265. \
 \
Unlike the commonly used HTTP::Cookies module, this module does not require \
use of HTTP::Request and HTTP::Response objects. An LWP-compatible adapter \
is available as HTTP::CookieJar::LWP."
LICENSE = "Apache-2.0"

PV = "0.014"

RPM_NAME = "perl-HTTP-CookieJar-0.014-1.4.noarch.rpm"
RPM_HASH = "8d1e9286add934cdab1ee080a39f532a37b848cf4bd2e6791c218dc2f8417d2b897d40acc803e7dffb1e37f601f5166e5808db0cb3ff76883944f388450ec450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--CookieJar \
perl-HTTP--CookieJar--LWP \
perl-HTTP-CookieJar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Date \
perl-Time--Local \
perl-parent"

inherit rpm
