SUMMARY = "Documentation for texlive-tinos"
DESCRIPTION = "This package includes the documentation for texlive-tinos"
LICENSE = "Apache-1.0"

PV = "2023.201.svn64504"

RPM_NAME = "texlive-tinos-doc-2023.201.svn64504-52.1.noarch.rpm"
RPM_HASH = "ae68181f7f54011a35b1ba24b88695019702328f4f55c62d230a434c795cc4ee60ffb5bb63976ed3db9f142efe1a68bb83ab6f7c9727c6fc8086fc12eba0f41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tinos-doc"

RDEPENDS:${PN} += ""

inherit rpm
