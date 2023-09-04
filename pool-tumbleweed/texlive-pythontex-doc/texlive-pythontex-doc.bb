SUMMARY = "Documentation for texlive-pythontex"
DESCRIPTION = "This package includes the documentation for texlive-pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.18svn59514"

RPM_NAME = "texlive-pythontex-doc-2023.209.0.0.18svn59514-54.2.noarch.rpm"
RPM_HASH = "5a9580f8ea3a650472f54af0b0719b05328b7d1007b275b1a1e57c33c8331646b9da96d8e053b94720fce76bb359aebb3f8fddf806732009fbd2a8162c21c15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythontex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
