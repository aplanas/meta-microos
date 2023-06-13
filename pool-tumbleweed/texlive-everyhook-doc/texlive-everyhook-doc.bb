SUMMARY = "Documentation for texlive-everyhook"
DESCRIPTION = "This package includes the documentation for texlive-everyhook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn35675"

RPM_NAME = "texlive-everyhook-doc-2023.201.1.2svn35675-52.1.noarch.rpm"
RPM_HASH = "5391434d3cb2c99e3b114506d44e4755d02b9de130ea7bd77a61c4dcdf7cc14837d6f0c0e19617733a31cadb0ac97528cf4b6573c1a107922b7331182e142ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everyhook-doc"

RDEPENDS:${PN} += ""

inherit rpm
