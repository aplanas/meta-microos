SUMMARY = "Documentation for texlive-aurical"
DESCRIPTION = "This package includes the documentation for texlive-aurical"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-aurical-doc-2023.209.1.5svn15878-54.1.noarch.rpm"
RPM_HASH = "082dc1047b99d5eda7d21f457961e7a36fbe8ea27f0a6f3904cef9e6a6dae35d6c5c1956382fdf27b171a08d8d2a6799d93020933f3b1af3a5d3a08d25168e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aurical-doc"

RDEPENDS:${PN} += ""

inherit rpm
