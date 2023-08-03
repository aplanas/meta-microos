SUMMARY = "Documentation for texlive-clojure-pamphlet"
DESCRIPTION = "This package includes the documentation for texlive-clojure-pamphlet"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn60981"

RPM_NAME = "texlive-clojure-pamphlet-doc-2023.209.1.3svn60981-54.1.noarch.rpm"
RPM_HASH = "13e03cad5f801c1fe0ef10e2f6ab19ba8311a909e439c9c02d5cd31f4efac7efa41804bbb250d8bc9f0bbe48d39516aa4525771f4ded8d10d8fd89e8fcb9fa6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pamphletangler.1 \
texlive-clojure-pamphlet-doc"

RDEPENDS:${PN} += ""

inherit rpm
