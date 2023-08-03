SUMMARY = "Documentation for texlive-context-transliterator"
DESCRIPTION = "This package includes the documentation for texlive-context-transliterator"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn61127"

RPM_NAME = "texlive-context-transliterator-doc-2023.209.svn61127-55.1.noarch.rpm"
RPM_HASH = "65aab36a992a2949145129ddbeef8e80aa482ccbc247b478ed627beae9436f61fcfa0912a5793573d6a4803bc33bc11d1cf191eceab31a6da8d7fdf317736308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-transliterator-doc"

RDEPENDS:${PN} += ""

inherit rpm
