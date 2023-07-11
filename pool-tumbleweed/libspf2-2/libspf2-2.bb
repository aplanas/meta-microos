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

RPM_NAME = "libspf2-2-1.2.11-6.13.aarch64.rpm"
RPM_HASH = "853038b01acadbc1fdaf23e14d9ef494b4ae2b02b51c5368949b98d0f358d9bf735547f593b3d9bd4f163c2e41958aee5e25c4113a03875881deed6992764501"

RPROVIDES:${PN} += "libspf2-2 \
libspf2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libresolv.so.2"

inherit rpm
