SUMMARY = "Documentation for texlive-noto-emoji"
DESCRIPTION = "This package includes the documentation for texlive-noto-emoji"
LICENSE = "OFL-1.1"

PV = "2023.209.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-doc-2023.209.2.034svn62950-55.1.noarch.rpm"
RPM_HASH = "aeb57f6c6f4996a7b8213beb5c17467d68ab42deb8e1f6957641f305f31dffaa8a62c8cc4294daa2debfc62f4f840897850d972cc4ae29e343b47795f24cf4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-emoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
