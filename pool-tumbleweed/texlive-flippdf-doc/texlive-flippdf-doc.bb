SUMMARY = "Documentation for texlive-flippdf"
DESCRIPTION = "This package includes the documentation for texlive-flippdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn56782"

RPM_NAME = "texlive-flippdf-doc-2023.201.2.0bsvn56782-52.1.noarch.rpm"
RPM_HASH = "b03adeb713522333c38f2b2af2a037a5acfdee47ee0e6d20ccc243df92a8202f6468a69965ce0cfd4929f0c6fb122b20f5e0f462152cdd90ba71996f55a90007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flippdf-doc"
RDEPENDS:${PN} += ""

inherit rpm
