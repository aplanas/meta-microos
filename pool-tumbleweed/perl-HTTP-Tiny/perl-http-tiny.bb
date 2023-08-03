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

RPM_NAME = "perl-HTTP-Tiny-0.88.0-1.1.noarch.rpm"
RPM_HASH = "64f8845d8cea9e41b7bbd1eb6fac7f2402e0c1c9313ffda599c4d258be9d7abab344a1d40eedf45588e707665d9f85fbbb36f27184f648972d0be893d1113761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tiny \
perl-HTTP-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
