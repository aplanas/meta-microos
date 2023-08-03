SUMMARY = "Documentation for texlive-program"
DESCRIPTION = "This package includes the documentation for texlive-program"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.3.14svn44214"

RPM_NAME = "texlive-program-doc-2023.209.3.3.14svn44214-53.1.noarch.rpm"
RPM_HASH = "9cd9589b046288f85aba56ec8528748fc75d80d9f58b974926ccc345e30d038d32021e83876282914c40edf69b8f505ed944021a5be42edd2e7ac725089b4fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-program-doc"

RDEPENDS:${PN} += ""

inherit rpm
