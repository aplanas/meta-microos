SUMMARY = "Documentation for texlive-andika"
DESCRIPTION = "This package includes the documentation for texlive-andika"
LICENSE = "OFL-1.1"

PV = "2023.201.6.101svn64540"

RPM_NAME = "texlive-andika-doc-2023.201.6.101svn64540-54.1.noarch.rpm"
RPM_HASH = "f6c34cba3d47b1f7b7e8c0e49fadec730fc23477fd8240de49e335abf426f4d843ee193783276d94e3c32b830051f991e7484c3d4080aebc011445a8b833aabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-andika-doc"

RDEPENDS:${PN} += ""

inherit rpm
