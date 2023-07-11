SUMMARY = "Simple but non-blocking HTTP/HTTPS client"
DESCRIPTION = "This module is an AnyEvent user, you need to make sure that you use and run \
a supported event loop. \
 \
This module implements a simple, stateless and non-blocking HTTP client. It \
supports GET, POST and other request methods, cookies and more, all on a \
very low level. It can follow redirects, supports proxies, and \
automatically limits the number of connections to the values specified in \
the RFC. \
 \
It should generally be a 'good client' that is enough for most HTTP tasks. \
Simple tasks should be simple, but complex tasks should still be possible \
as the user retains control over request and response headers. \
 \
The caller is responsible for authentication management, cookies (if the \
simplistic implementation in this module doesn't suffice), referer and \
other high-level protocol details for which this module offers only limited \
support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.25"

RPM_NAME = "perl-AnyEvent-HTTP-2.25-1.14.noarch.rpm"
RPM_HASH = "833fa7b038b3ccddddc86b13339523cdc2ee2999c6bd47f1583cbef543dc05e06106a6e807440697db9e9ccafd79c3c6e5571af10825ebca92b37de7ae33f325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--HTTP \
perl-AnyEvent-HTTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AnyEvent \
perl-common--sense"

inherit rpm
