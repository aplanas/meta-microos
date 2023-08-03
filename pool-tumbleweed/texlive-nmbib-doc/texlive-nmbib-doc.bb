SUMMARY = "Documentation for texlive-nmbib"
DESCRIPTION = "This package includes the documentation for texlive-nmbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn37984"

RPM_NAME = "texlive-nmbib-doc-2023.209.1.04svn37984-55.1.noarch.rpm"
RPM_HASH = "4fba33ffba48ec1afd9307f21c957cfe575f9d5a36f3d8e267c700df405c1864cf5775c4f9dc2fd5caf1a10335e8f10d87fff825c7265e63a3002af3d31b18a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nmbib-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
