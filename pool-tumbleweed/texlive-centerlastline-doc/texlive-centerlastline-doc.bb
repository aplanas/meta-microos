SUMMARY = "Documentation for texlive-centerlastline"
DESCRIPTION = "This package includes the documentation for texlive-centerlastline"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56644"

RPM_NAME = "texlive-centerlastline-doc-2023.201.1.0svn56644-52.1.noarch.rpm"
RPM_HASH = "c0af71c2db866844c8d1f6e1ad482f3eb92215fe4c155ced2fd4329a4b98673fb954319cc9b78400192b85f2aa25d6579be7a5221ca73c550a2aa06aa6b97c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-centerlastline-doc"
RDEPENDS:${PN} += ""

inherit rpm
