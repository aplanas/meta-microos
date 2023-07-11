SUMMARY = "Documentation for texlive-marcellus"
DESCRIPTION = "This package includes the documentation for texlive-marcellus"
LICENSE = "OFL-1.1"

PV = "2023.208.svn64451"

RPM_NAME = "texlive-marcellus-doc-2023.208.svn64451-53.1.noarch.rpm"
RPM_HASH = "7c677c0ebd1c7b52a5abeae68b21b7fdca924b2509d56ebc80b924617889e9cc904281a6e634dafeeb5cff2f4abdce954bbe9b84444f9e6298a0f24a96d942d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marcellus-doc"

RDEPENDS:${PN} += ""

inherit rpm
