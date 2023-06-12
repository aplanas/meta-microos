SUMMARY = "Documentation for texlive-ktv-texdata"
DESCRIPTION = "This package includes the documentation for texlive-ktv-texdata"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.05.34svn27369"

RPM_NAME = "texlive-ktv-texdata-doc-2023.201.05.34svn27369-55.1.noarch.rpm"
RPM_HASH = "db22d59da61f2b52173d92d55545832d657a7e09d148282d509df0993e99b0fff767f3c18a5a915ab5c9653fbdffea17e3dbab291ae8c522b93096b503d3395b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ktv-texdata-doc"
RDEPENDS:${PN} += ""

inherit rpm
