SUMMARY = "Documentation for the High-Performance E-Mail Virus Scanner"
DESCRIPTION = "Amavisd-new is a high-performance interface between mailer (MTA) and \
content checkers: virus scanners or SpamAssassin. It talks to the MTA \
via (E)SMTP, LMTP. \
 \
This package contains the documentation and Release-Notes."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "amavisd-new-docs-2.13.0-2.1.noarch.rpm"
RPM_HASH = "f4e2bfdb5d8d96444952d244dfabbf542bd26bfc6ef618971629297ac51d78b58467fd0b9122097b44242e3733ac34d95699baec12b6029f2e610bba8f729547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amavisd-new-docs"

RDEPENDS:${PN} += ""

inherit rpm
