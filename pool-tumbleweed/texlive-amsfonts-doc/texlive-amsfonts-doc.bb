SUMMARY = "Documentation for texlive-amsfonts"
DESCRIPTION = "This package includes the documentation for texlive-amsfonts"
LICENSE = "OFL-1.1"

PV = "2023.209.3.04svn61937"

RPM_NAME = "texlive-amsfonts-doc-2023.209.3.04svn61937-55.1.noarch.rpm"
RPM_HASH = "971d8430b3ac2db9925acd22278d6216c4067311c37f92da08727c188eec63fd9d9bb4817e441d71783db5ed63f7d342224ccb8895182175b7be5819e0101302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
