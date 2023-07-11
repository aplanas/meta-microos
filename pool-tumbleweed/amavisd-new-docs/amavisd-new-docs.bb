SUMMARY = "Documentation for the High-Performance E-Mail Virus Scanner"
DESCRIPTION = "Amavisd-new is a high-performance interface between mailer (MTA) and \
content checkers: virus scanners or SpamAssassin. It talks to the MTA \
via (E)SMTP, LMTP. \
 \
This package contains the documentation and Release-Notes."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "amavisd-new-docs-2.13.0-2.2.noarch.rpm"
RPM_HASH = "0c1b3bbe33d98eb109907c3eab9ae295499f628ab348095d82bd23e184b5f6f8b7c0cbc07850868a40899d3343de970cd27c377d4229ae2fe053fb662baf00e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amavisd-new-docs"

RDEPENDS:${PN} += ""

inherit rpm
