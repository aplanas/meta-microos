SUMMARY = "Documentation for texlive-babel-macedonian"
DESCRIPTION = "This package includes the documentation for texlive-babel-macedonian"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn39587"

RPM_NAME = "texlive-babel-macedonian-doc-2023.201.svn39587-53.1.noarch.rpm"
RPM_HASH = "d63fd3e8b937a4a43a92210318074171111fcc1b20d6ee5689ad4ceecc661e058480eb0b702ed20d043253aa1583e3cfd4c38019285d080ca31bab8d255a9f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-macedonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
