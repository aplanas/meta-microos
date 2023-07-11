SUMMARY = "Documentation for texlive-grotesq"
DESCRIPTION = "This package includes the documentation for texlive-grotesq"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn35859"

RPM_NAME = "texlive-grotesq-doc-2023.201.svn35859-53.2.noarch.rpm"
RPM_HASH = "a7b3d46210b52f92c6fbb52460097f76f45e0ca6bb8a9dc6c1749e2d6b824d9391a45cb89635dae8c399e9214e2e8088b2be32c5de18ec0664a89474fb798f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grotesq-doc"

RDEPENDS:${PN} += ""

inherit rpm
