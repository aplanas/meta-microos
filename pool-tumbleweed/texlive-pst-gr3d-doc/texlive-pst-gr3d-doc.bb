SUMMARY = "Documentation for texlive-pst-gr3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-gr3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn15878"

RPM_NAME = "texlive-pst-gr3d-doc-2023.209.1.34svn15878-53.1.noarch.rpm"
RPM_HASH = "c53c346c6e1126a384c99b2feabd9b022d9dab87e3dad9a30fc81f052679a9f4246ea21ba47af60e44d6bbab60cec7aa1c114eebc785c26e09b8a6e5a85283db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gr3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
