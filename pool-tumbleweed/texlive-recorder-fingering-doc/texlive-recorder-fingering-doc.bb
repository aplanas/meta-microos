SUMMARY = "Documentation for texlive-recorder-fingering"
DESCRIPTION = "This package includes the documentation for texlive-recorder-fingering"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-doc-2023.209.1.1bsvn66008-54.2.noarch.rpm"
RPM_HASH = "2ed6d57e30c65cefb3e8da8501178150ccc9f82fa5034d821ed2420ab343bc9ed252b4057c3803e0b4a2053621cf0451cfd3367ab230a8f499b121e89898a02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recorder-fingering-doc"

RDEPENDS:${PN} += ""

inherit rpm
