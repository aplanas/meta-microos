SUMMARY = "Documentation for texlive-greenpoint"
DESCRIPTION = "This package includes the documentation for texlive-greenpoint"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-greenpoint-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "81410de1a0a1f580f8ff99f26b7787b7318f1db5286c0123e7073507988903b37efa92fd75b794a3e62df3928695749786154d596856b9c8748c3669de611fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greenpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm
