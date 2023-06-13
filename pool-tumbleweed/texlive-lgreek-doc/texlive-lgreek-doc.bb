SUMMARY = "Documentation for texlive-lgreek"
DESCRIPTION = "This package includes the documentation for texlive-lgreek"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn21818"

RPM_NAME = "texlive-lgreek-doc-2023.201.svn21818-54.1.noarch.rpm"
RPM_HASH = "118446b747af99a0ed707780dcc1f049657f63f81deb95441e48c15186a9d10a630dbef288900ba2ad723309cd5425435e091fa05c3bea7a71c99ad294c1b03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
