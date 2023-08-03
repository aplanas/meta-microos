SUMMARY = "Documentation for texlive-currvita"
DESCRIPTION = "This package includes the documentation for texlive-currvita"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-currvita-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "913b59bebccf46eb21ba56d12d7c36db9be0b5f93aa7ac04489314ca9a366123d2299d9ee0cff29d3aee36e68448e8507652d30ae46905377edc30f7227360a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currvita-doc"

RDEPENDS:${PN} += ""

inherit rpm
