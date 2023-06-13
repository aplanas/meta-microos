SUMMARY = "Documentation for texlive-menucard"
DESCRIPTION = "This package includes the documentation for texlive-menucard"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55643"

RPM_NAME = "texlive-menucard-doc-2023.201.0.0.1svn55643-54.1.noarch.rpm"
RPM_HASH = "31dd0858b727bf254a3de87a68d6b713f5da4740819288d1e699ff4c845f73ead191aeb12262d1d816c15858fc944734e35ccd2ff5dc4550c9105156e6ea7271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menucard-doc"

RDEPENDS:${PN} += ""

inherit rpm
