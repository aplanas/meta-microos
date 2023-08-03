SUMMARY = "Documentation for texlive-gregoriotex"
DESCRIPTION = "This package includes the documentation for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-doc-2023.209.6.0.0svn58331-54.1.noarch.rpm"
RPM_HASH = "2092a0c75e19632771b7e141ad5dac1109d38f0d4903290996b5a21c251bca0ec5182bcfa948bbb6a5aa341bb6e689f9730a6193eb5b37ec7d819cc1418217bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gregoriotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
