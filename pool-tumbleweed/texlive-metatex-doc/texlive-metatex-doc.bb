SUMMARY = "Documentation for texlive-metatex"
DESCRIPTION = "This package includes the documentation for texlive-metatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-metatex-doc-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "7164614c7eb61549ad27ea4fdebd7fd83f84f7e6c2f7a2540e26e8bd16f3e5d4a9ae8048fde9e60b28d28c008ade44af4e8952b900d683c9e6297b5d7ffe598d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
