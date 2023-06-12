SUMMARY = "Documentation for texlive-dviincl"
DESCRIPTION = "This package includes the documentation for texlive-dviincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.00svn29349"

RPM_NAME = "texlive-dviincl-doc-2023.201.1.00svn29349-53.1.noarch.rpm"
RPM_HASH = "ad33e4e7e28094e7d5175f928577b090cfb710074399447066bb8ef45645f77bfa9534e811e1798a60f2fb3ea03e32a666ad6985dcfd742941d756e4fea13d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dviincl-doc:en;pl) \
texlive-dviincl-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
