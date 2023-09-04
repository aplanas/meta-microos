SUMMARY = "Small, simple, correct HTTP/1.1 client"
DESCRIPTION = "This is a very simple HTTP/1.1 client, designed for doing simple requests \
without the overhead of a large framework like LWP::UserAgent. \
 \
It is more correct and more complete than HTTP::Lite. It supports proxies \
and redirection. It also correctly resumes after EINTR. \
 \
If IO::Socket::IP 0.25 or later is installed, HTTP::Tiny will use it \
instead of IO::Socket::INET for transparent support for both IPv4 and IPv6. \
 \
Cookie support requires HTTP::CookieJar or an equivalent class."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88.0"

RPM_NAME = "perl-HTTP-Tiny-0.88.0-1.2.noarch.rpm"
RPM_HASH = "5a9160c042c7383fe0e593988d3416328a20d155ec240fa95f08381c123580bc80a36b4e051caee3be4afaaf33b51e727eabcc53ede904f6b2db9cf4d26789bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tiny \
perl-HTTP-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
