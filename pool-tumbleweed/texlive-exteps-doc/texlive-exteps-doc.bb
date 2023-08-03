SUMMARY = "Documentation for texlive-exteps"
DESCRIPTION = "This package includes the documentation for texlive-exteps"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.41svn19859"

RPM_NAME = "texlive-exteps-doc-2023.209.0.0.41svn19859-53.1.noarch.rpm"
RPM_HASH = "2e82d6a049b51bfca1f5dea14b570275a59b9e5c30a5e429aa94c579eea441af5e431f08037a25392b94349c17d1b7d7a6a19ef05f7727a5387ba97a38159fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exteps-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
