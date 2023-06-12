SUMMARY = "Documentation for texlive-cool"
DESCRIPTION = "This package includes the documentation for texlive-cool"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.204.1.35svn15878"

RPM_NAME = "texlive-cool-doc-2023.204.1.35svn15878-54.1.noarch.rpm"
RPM_HASH = "6f05ed8f40a4c44360792a7ea527e8a5cbe7efcdc6432fa8d47f71df466ad1378064e46995958d2c82110c824108620072b52a459977494d91474d51f4453473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cool-doc"
RDEPENDS:${PN} += ""

inherit rpm
