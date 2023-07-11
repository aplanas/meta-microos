SUMMARY = "Documentation for texlive-lualibs"
DESCRIPTION = "This package includes the documentation for texlive-lualibs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.75svn64615"

RPM_NAME = "texlive-lualibs-doc-2023.208.2.75svn64615-53.1.noarch.rpm"
RPM_HASH = "3f013cbfa4c70385f0169093d090a13ebcfe8654ac7490c7131270229fafeaaa363d7170ef35a362f9eda792c75a967e6297a9aedfd48020ba1055b8803777aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualibs-doc"

RDEPENDS:${PN} += ""

inherit rpm
