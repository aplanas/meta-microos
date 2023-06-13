SUMMARY = "Documentation for texlive-apalike-german"
DESCRIPTION = "This package includes the documentation for texlive-apalike-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65403"

RPM_NAME = "texlive-apalike-german-doc-2023.201.svn65403-54.1.noarch.rpm"
RPM_HASH = "95913e505afea63aeaaecc7bb4e4d2e061fdb6042a3d3d46b8f42dd866d0c82726ce5201721f6d466a58333a17efc89d63b04776bdbcd00bf8ce72f99ce1634f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
