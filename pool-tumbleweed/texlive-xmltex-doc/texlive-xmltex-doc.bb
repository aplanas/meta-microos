SUMMARY = "Documentation for texlive-xmltex"
DESCRIPTION = "This package includes the documentation for texlive-xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-doc-2023.201.0.0.8svn62145-52.1.noarch.rpm"
RPM_HASH = "a0a5026a0d62b8e7dde354a7e3d0fec989edfdd3c02e6aa2c6b7621d23b200d33de7b44b292707e094e64c5ae580efba65881dbb8a94397b85cd9c1413cbd4d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
