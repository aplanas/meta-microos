SUMMARY = "Minimalist HTTP user agent cookie jar"
DESCRIPTION = "This module implements a minimalist HTTP user agent cookie jar in \
conformance with at http://tools.ietf.org/html/rfc6265. \
 \
Unlike the commonly used HTTP::Cookies module, this module does not require \
use of HTTP::Request and HTTP::Response objects. An LWP-compatible adapter \
is available as HTTP::CookieJar::LWP."
LICENSE = "Apache-2.0"

PV = "0.014"

RPM_NAME = "perl-HTTP-CookieJar-0.014-1.3.noarch.rpm"
RPM_HASH = "de917dfbf0bdb7ebf8be2e8ddf35d7836d6b125cbc76d209fd339486dde19f79f63a5945164b9e28ae61f1c94e5afaecab0f0dc3e75e5ec21124ec7b73353aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--CookieJar \
perl-HTTP--CookieJar--LWP \
perl-HTTP-CookieJar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Date \
perl-Time--Local \
perl-parent"

inherit rpm
