SUMMARY = "Documentation HTML files for Racket"
DESCRIPTION = "A local installation of the Racket documentation system."
LICENSE = "Apache-2.0 | MIT"

PV = "8.9"

RPM_NAME = "racket-doc-8.9-1.3.noarch.rpm"
RPM_HASH = "37467f7fb4a56d413ddb59d880966d028b94655ad5d42e00a7b4afe4345b27d5021bee79d9689d24f054a02bc8cf8200a3eed0ba58650aa9aa0d5e0d34f8b798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "racket-/usr/share/doc/packages/racket/docindex.sqlite \
racket-doc"

RDEPENDS:${PN} += ""

inherit rpm
