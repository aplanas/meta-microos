SUMMARY = "Documentation for texlive-xcpdftips"
DESCRIPTION = "This package includes the documentation for texlive-xcpdftips"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-doc-2023.201.1.1svn50449-52.1.noarch.rpm"
RPM_HASH = "4da15690451baf0bb6fe32df94c7a4f20fa7e5104e8ab9b972862ee4badb9e35733578a37210228b7644649a4dd6c1e32231df21bdb2b8f30a77b49a029d55bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcpdftips-doc"
RDEPENDS:${PN} += ""

inherit rpm
