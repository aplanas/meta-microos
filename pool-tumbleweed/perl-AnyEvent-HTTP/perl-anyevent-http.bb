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

RPM_NAME = "perl-AnyEvent-HTTP-2.25-1.13.noarch.rpm"
RPM_HASH = "961844ae327f478485d9f6c90962c06707e0002f2dcef133734537f8c130baa8763e259dbea407d1e19ca487bbfc2b63ac695f1a745f449cf31adf33872d0dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AnyEvent::HTTP) \
perl-AnyEvent-HTTP"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(AnyEvent) \
perl(common::sense)"

inherit rpm
