SUMMARY = "Documentation for texlive-units"
DESCRIPTION = "This package includes the documentation for texlive-units"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9bsvn42428"

RPM_NAME = "texlive-units-doc-2023.209.0.0.9bsvn42428-54.1.noarch.rpm"
RPM_HASH = "3ee3126492e42a854027ffc9a59f7cd81cf5a8c43f63c9cd675da37ac3e40fd7d22534bae1d768139c178a8f41cdcd86bff92606ef8381421126a9000fe88341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-units-doc"

RDEPENDS:${PN} += ""

inherit rpm
