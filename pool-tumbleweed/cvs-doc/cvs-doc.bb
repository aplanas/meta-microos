SUMMARY = "Info pages and Open Source Development with CVS, 2nd Edition Book"
DESCRIPTION = "Info pages for cvs, an introduction to cvs \
(/usr/share/cvs/contrib/intro.doc) and the complete book 'Open Source \
Development with CVS, 2nd Edition'."
LICENSE = "GPL-2.0-only"

PV = "1.12.13"

RPM_NAME = "cvs-doc-1.12.13-2.8.noarch.rpm"
RPM_HASH = "69b4450fcfd561c127721281fc75d676e5805b29f04dd270865fe6223e3e72586497a44e7b1d3fb335d1ffa95f6959a781d859577440fc2119a0253a7ea5d3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cvs-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
