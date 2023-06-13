SUMMARY = "Documentation for texlive-hereapplies"
DESCRIPTION = "This package includes the documentation for texlive-hereapplies"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-doc-2023.201.1.0.1svn65251-53.1.noarch.rpm"
RPM_HASH = "e0e74d80772d3de0b98a235f2cce43dc6dc9f446a2915730f6bf9724ed400d3d90da7da9c7b4b022a6e519da623355f246b9fbadecb79876002df09fa2b73faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hereapplies-doc"

RDEPENDS:${PN} += ""

inherit rpm
