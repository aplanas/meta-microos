SUMMARY = "Documentation for the High-Performance E-Mail Virus Scanner"
DESCRIPTION = "Amavisd-new is a high-performance interface between mailer (MTA) and \
content checkers: virus scanners or SpamAssassin. It talks to the MTA \
via (E)SMTP, LMTP. \
 \
This package contains the documentation and Release-Notes."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "amavisd-new-docs-2.13.0-3.1.noarch.rpm"
RPM_HASH = "90e4a5dbb48a0f7d29701c9cf147205f65f875edef0825784a791d5d2b518fcc82b59421c6b97191355be27a51352f2c85c356b0821a3d1d6dda1a1e6dda651b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amavisd-new-docs"

RDEPENDS:${PN} += ""

inherit rpm
