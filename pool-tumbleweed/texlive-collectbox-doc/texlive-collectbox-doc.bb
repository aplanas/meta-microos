SUMMARY = "Documentation for texlive-collectbox"
DESCRIPTION = "This package includes the documentation for texlive-collectbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4csvn64967"

RPM_NAME = "texlive-collectbox-doc-2023.209.0.0.4csvn64967-54.1.noarch.rpm"
RPM_HASH = "7c634ec436dd6c869676a8ac8cb97089e54308fcad930d9ff701162c7cc413c58b5413bc32cc02e857a5a188ffb908848c62cf6f9b2135201ab205c3d34cf15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collectbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
