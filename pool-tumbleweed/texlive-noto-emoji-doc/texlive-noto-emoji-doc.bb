SUMMARY = "Documentation for texlive-noto-emoji"
DESCRIPTION = "This package includes the documentation for texlive-noto-emoji"
LICENSE = "OFL-1.1"

PV = "2023.201.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-doc-2023.201.2.034svn62950-54.1.noarch.rpm"
RPM_HASH = "f4425f35342eabaf2650eb288100503b0393033723f4642677bb1244088f2d5705901418f28436efcd5e63cff2b462f0f2a6ea184a3bcb58a9fdbfdb94a2974c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-emoji-doc"
RDEPENDS:${PN} += ""

inherit rpm
