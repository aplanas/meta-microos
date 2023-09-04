SUMMARY = "An implementation of the SPF specification"
DESCRIPTION = "libspf2 is an implementation of the SPF (Sender Policy Framework) \
specification as found at: \
http://www.ietf.org/internet-drafts/draft-mengwong-spf-00.txt \
SPF allows email systems to check SPF DNS records and make sure that \
an email is authorized by the administrator of the domain name that \
it is coming from. This prevents email forgery, commonly used by \
spammers, scammers, and email viruses/worms. \
 \
A lot of effort has been put into making it secure by design, and a \
great deal of effort has been put into the regression tests."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-2-1.2.11-6.14.aarch64.rpm"
RPM_HASH = "1b54797780aa8097864292eb4dd4664bb77e2151a3934477c6810bd460c8b69cfeda7b15463b80c21708533b4bd13c2d83dc481fc9ea912e1efc0df17ab1926e"

RPROVIDES:${PN} += "libspf2-2 \
libspf2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libresolv.so.2"

inherit rpm
