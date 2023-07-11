SUMMARY = "Documentation for texlive-icite"
DESCRIPTION = "This package includes the documentation for texlive-icite"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.3asvn54512"

RPM_NAME = "texlive-icite-doc-2023.208.1.3asvn54512-53.1.noarch.rpm"
RPM_HASH = "8dac232145eb711f4f8c2c7e16cb6826b01efac7272ead7da012ba41569bbe7b05cc74bf34ac1c6f031bd86c1063d23776bdb6d51726c5002b6ad32269c613cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icite-doc"

RDEPENDS:${PN} += ""

inherit rpm
