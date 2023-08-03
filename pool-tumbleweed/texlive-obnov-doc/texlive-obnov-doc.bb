SUMMARY = "Documentation for texlive-obnov"
DESCRIPTION = "This package includes the documentation for texlive-obnov"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn33355"

RPM_NAME = "texlive-obnov-doc-2023.209.0.0.11svn33355-55.1.noarch.rpm"
RPM_HASH = "8dee59ecea81850f1d2226edebc00fbc1f2fdaf90baf494d12da45c1b98cb94ef228363ee1aa32987bd295b2a341814b97eb430cb8055e44a59b561d6f791969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-obnov-doc"

RDEPENDS:${PN} += ""

inherit rpm
