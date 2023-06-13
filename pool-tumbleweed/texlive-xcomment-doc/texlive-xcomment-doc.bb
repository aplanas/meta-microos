SUMMARY = "Documentation for texlive-xcomment"
DESCRIPTION = "This package includes the documentation for texlive-xcomment"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn20031"

RPM_NAME = "texlive-xcomment-doc-2023.201.1.3svn20031-52.1.noarch.rpm"
RPM_HASH = "ea554d273ab6941a5df366176baa9f13c3fc2c14fa2fd726da2f29fb3f9e26c6de525dc15b23c2babcdd0c533d825786da7df66e4e0fc6821aaeb822038edb2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
