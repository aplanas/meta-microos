SUMMARY = "Documentation for texlive-program"
DESCRIPTION = "This package includes the documentation for texlive-program"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.3.14svn44214"

RPM_NAME = "texlive-program-doc-2023.201.3.3.14svn44214-52.1.noarch.rpm"
RPM_HASH = "6220d16f7f571c2adcbf113dd182584a354b21292d934aa457a6294f06cd44bed3450f62a9c7051c82320f0c7611957170c73ce74bb3d4134958f37398adf7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-program-doc"
RDEPENDS:${PN} += ""

inherit rpm
