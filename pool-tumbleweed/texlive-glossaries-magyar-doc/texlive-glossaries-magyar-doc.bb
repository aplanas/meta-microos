SUMMARY = "Documentation for texlive-glossaries-magyar"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-magyar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "b860f40dc1854cb72935713d12d0ba15340d4ea0f6fee6437b8d0c70f53fa52fc12ee25b52e6242b7a5804e0dae6e92de1375f1c8b8ea1c5e9a8c4292d78088f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
