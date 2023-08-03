SUMMARY = "Documentation for texlive-amiri"
DESCRIPTION = "This package includes the documentation for texlive-amiri"
LICENSE = "OFL-1.1"

PV = "2023.209.1.000svn65191"

RPM_NAME = "texlive-amiri-doc-2023.209.1.000svn65191-55.1.noarch.rpm"
RPM_HASH = "ce247bd12807d03eb256a71d06865e32307c60bb7a2d7eaa040e5d1412ba2378c286f793c48d20d43851e0be91e24a4baacf9a910c39a26e04d6aef1d9589fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-amiri-doc-ar \
texlive-amiri-doc"

RDEPENDS:${PN} += ""

inherit rpm
