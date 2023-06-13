SUMMARY = "Documentation HTML files for Racket"
DESCRIPTION = "A local installation of the Racket documentation system."
LICENSE = "Apache-2.0 | MIT"

PV = "8.9"

RPM_NAME = "racket-doc-8.9-1.1.noarch.rpm"
RPM_HASH = "7c79bcd2c50861155ecb8bf131c4435d989d4aea7c9c63fb0dbdc6f4c3b7782908e392d75f3c2a4e413e1b6a5699400ea2d8125e810de5a8807ac6e3010be928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "racket-doc \
racket:/usr/share/doc/packages/racket/docindex.sqlite"

RDEPENDS:${PN} += ""

inherit rpm
