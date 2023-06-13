SUMMARY = "Documentation for texlive-fontawesome5"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome5"
LICENSE = "OFL-1.1"

PV = "2023.201.5.15.4svn63207"

RPM_NAME = "texlive-fontawesome5-doc-2023.201.5.15.4svn63207-52.1.noarch.rpm"
RPM_HASH = "bb1df161adf097e6306e6fcaef12c99fd009e76b5ef836207bca7cc26244a4f2084cc03e4884f5c0a674244ebdc8193eb0987f34d9754cd00c7bb26120a2cd5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome5-doc"

RDEPENDS:${PN} += ""

inherit rpm
