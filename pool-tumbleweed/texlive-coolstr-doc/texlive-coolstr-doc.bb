SUMMARY = "Documentation for texlive-coolstr"
DESCRIPTION = "This package includes the documentation for texlive-coolstr"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.2.2svn15878"

RPM_NAME = "texlive-coolstr-doc-2023.209.2.2svn15878-55.1.noarch.rpm"
RPM_HASH = "5bff7fbfd04c9f9bfd6793a1e8f83b060b68a708dc608f2bf9176dfd4c858f7b07ff60cb024b65596618828d944125713f93a111ef61b978083bf54b9c8d42f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolstr-doc"

RDEPENDS:${PN} += ""

inherit rpm
