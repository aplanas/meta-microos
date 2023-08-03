SUMMARY = "Documentation for texlive-harveyballs"
DESCRIPTION = "This package includes the documentation for texlive-harveyballs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn32003"

RPM_NAME = "texlive-harveyballs-doc-2023.209.1.1svn32003-54.1.noarch.rpm"
RPM_HASH = "94c96d16fd755f889d84bcde22820bdb3744778e0d111837902918f3b70f7ee82ef15c3f7d81c3652477d1643c905fe1dfce31335e1de3e110c93d6e468a6307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harveyballs-doc"

RDEPENDS:${PN} += ""

inherit rpm
