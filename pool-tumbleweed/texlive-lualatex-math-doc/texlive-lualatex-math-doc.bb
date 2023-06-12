SUMMARY = "Documentation for texlive-lualatex-math"
DESCRIPTION = "This package includes the documentation for texlive-lualatex-math"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn61464"

RPM_NAME = "texlive-lualatex-math-doc-2023.201.1.12svn61464-52.1.noarch.rpm"
RPM_HASH = "46fd1009c4d77facb0c8cc28d0f5a92885aae2cfa18528f78545817f31653c71f336756d976f425abc6d79e402184796faef789b9df99c7dcc9a5ed0e34f2d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-lualatex-math-doc:en) \
texlive-lualatex-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
