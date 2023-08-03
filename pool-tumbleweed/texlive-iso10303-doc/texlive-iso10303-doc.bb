SUMMARY = "Documentation for texlive-iso10303"
DESCRIPTION = "This package includes the documentation for texlive-iso10303"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-iso10303-doc-2023.209.1.5svn15878-56.1.noarch.rpm"
RPM_HASH = "7e5197ebf16ebfa562651b5d6a3c04768703caa1e23b0b41c1c96609b2f65f06d45dac0075f547d6702b7d72dbd44c16598774dfc4e6415d0590e32b8af9437c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iso10303-doc"

RDEPENDS:${PN} += ""

inherit rpm
