SUMMARY = "Documentation for texlive-semaphor"
DESCRIPTION = "This package includes the documentation for texlive-semaphor"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn18651"

RPM_NAME = "texlive-semaphor-doc-2023.201.svn18651-53.1.noarch.rpm"
RPM_HASH = "df2251030c0acc81644a4dcccbfd86d85ff2aaf895313e1ebc7dd83e30b4fa78c8685652acb4a52d612e74c7f2c150d8d16a3ad5554fda3e15a3274241cdaa7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semaphor-doc"

RDEPENDS:${PN} += ""

inherit rpm
