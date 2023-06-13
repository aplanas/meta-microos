SUMMARY = "Documentation for texlive-uptex-base"
DESCRIPTION = "This package includes the documentation for texlive-uptex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn65802"

RPM_NAME = "texlive-uptex-base-doc-2023.201.svn65802-53.1.noarch.rpm"
RPM_HASH = "e99e8925fb0607b105078f7a7b57ed6172069bd2e44f75e3a73e889b944c0758dc9ff62b708d71c63cc7d573e3d0da2960a2182c08b7c61e4675ac4bb49ef9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uptex-base-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
