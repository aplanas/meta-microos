SUMMARY = "Documentation for texlive-iftex"
DESCRIPTION = "This package includes the documentation for texlive-iftex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn61910"

RPM_NAME = "texlive-iftex-doc-2023.201.1.0fsvn61910-52.1.noarch.rpm"
RPM_HASH = "a5d7ce2c63ee34c6d55bc400055e6ee4b74ccd4c8f1e0abd7f78b711d2f0f6b26cf9cf5baa40703bd6ecdece537ad12022c36f64d23f5271089f156495e0de83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iftex-doc"

RDEPENDS:${PN} += ""

inherit rpm
