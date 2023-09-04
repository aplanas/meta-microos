SUMMARY = "Documentation for texlive-epspdf"
DESCRIPTION = "This package includes the documentation for texlive-epspdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-doc-2023.209.0.0.6.5.1svn66115-54.2.noarch.rpm"
RPM_HASH = "4ece4bf609c71fd574847d08cdf4aab6edcfa5a539d94b84d5428a42843727be85de711c919e846039aaec8646f76da09546ed40200b8f38af977bbe07add164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
