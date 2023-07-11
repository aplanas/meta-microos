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

PV = "0.086"

RPM_NAME = "perl-HTTP-Tiny-0.086-1.1.noarch.rpm"
RPM_HASH = "5fb33106289f2c73bb214822a14a2d0af2ce40240ed25c296647c68b22a3fd87fb2867609f802f05804e38155fb0f227a840470abbc1d39aac679232c9c01ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tiny \
perl-HTTP-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
