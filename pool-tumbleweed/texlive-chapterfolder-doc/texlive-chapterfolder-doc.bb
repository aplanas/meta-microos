SUMMARY = "Documentation for texlive-chapterfolder"
DESCRIPTION = "This package includes the documentation for texlive-chapterfolder"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.1svn15878"

RPM_NAME = "texlive-chapterfolder-doc-2023.209.2.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "4bedf91802a10652c06de7b18b7fef95a64a4a04767eda5a5057466db66f8094bc1dd0b580783d66def9b83b0f0e57126d1c61e03a49d209f9d6a2179d2b179b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chapterfolder-doc"

RDEPENDS:${PN} += ""

inherit rpm
