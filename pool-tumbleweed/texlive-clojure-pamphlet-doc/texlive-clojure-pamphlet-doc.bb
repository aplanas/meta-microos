SUMMARY = "Documentation for texlive-clojure-pamphlet"
DESCRIPTION = "This package includes the documentation for texlive-clojure-pamphlet"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn60981"

RPM_NAME = "texlive-clojure-pamphlet-doc-2023.201.1.3svn60981-53.1.noarch.rpm"
RPM_HASH = "e16c5214e2ae8406e94454f15fafda5ba8d378527081be29a2a16634f665b10fe2e7420109c980c90948b614beb3141a13bef816f2721f36001741337fb6e71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pamphletangler.1 \
texlive-clojure-pamphlet-doc"

RDEPENDS:${PN} += ""

inherit rpm
