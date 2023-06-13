SUMMARY = "Documentation for texlive-syntax"
DESCRIPTION = "This package includes the documentation for texlive-syntax"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-syntax-doc-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "f68a3d2b5e78c98bc5a172502a6ff9b94fe8e8ed3dcf1e692dd0e3955d665739a0440f22c18d5085a482fc0bd1b4a4585dd554f4cd538cb5b561b691ddb0d396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-syntax-doc:de) \
texlive-syntax-doc"

RDEPENDS:${PN} += ""

inherit rpm
