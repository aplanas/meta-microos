SUMMARY = "Documentation for texlive-beamertheme-npbt"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-npbt"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.1svn54512"

RPM_NAME = "texlive-beamertheme-npbt-doc-2023.209.4.1svn54512-54.1.noarch.rpm"
RPM_HASH = "cdb4f1893e2389a8fc66cbe6559c8f4d6aac43de1f16111c93b78fa5f0ee59168dffb1456bd92da0ce340dc3bcabcbb1c41f8e19c34bffec96f83106478198e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-npbt-doc"

RDEPENDS:${PN} += ""

inherit rpm
