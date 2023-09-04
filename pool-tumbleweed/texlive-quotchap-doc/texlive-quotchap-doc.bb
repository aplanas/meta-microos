SUMMARY = "Documentation for texlive-quotchap"
DESCRIPTION = "This package includes the documentation for texlive-quotchap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn56926"

RPM_NAME = "texlive-quotchap-doc-2023.209.1.3svn56926-54.2.noarch.rpm"
RPM_HASH = "a29edb2110cd42fb0f0e3f0bc42ee35b506a8fdb7805e121b698de35a68625d7763d0d3c2d19a3a9d1dbb061f748ee10cb0c05bf529eb1370cd10b16c98264ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
