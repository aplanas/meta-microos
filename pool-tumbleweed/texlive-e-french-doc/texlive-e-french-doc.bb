SUMMARY = "Documentation for texlive-e-french"
DESCRIPTION = "This package includes the documentation for texlive-e-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.11svn52027"

RPM_NAME = "texlive-e-french-doc-2023.201.6.11svn52027-53.1.noarch.rpm"
RPM_HASH = "45c915364dcd766075488eaeff2fe34669ea3a561fce4cf92339cb8d83d18592416cef50979af1078c5025e3870e6a47939ee2f9fc2ca84fb521a3c7e21d5a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-e-french-doc-en;fr \
texlive-e-french-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
