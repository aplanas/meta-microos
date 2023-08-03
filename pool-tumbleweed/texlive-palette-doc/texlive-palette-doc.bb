SUMMARY = "Documentation for texlive-palette"
DESCRIPTION = "This package includes the documentation for texlive-palette"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn60119"

RPM_NAME = "texlive-palette-doc-2023.209.1.1.0svn60119-52.1.noarch.rpm"
RPM_HASH = "3c2954ec2d1cf926c3657fd4b0de885b4949d4f0e6eaa1f7f2bd9c121ec8b3e0dc0b53b874f61c4a42663143705e32203ca73abbc3a2f4f4f8a1806b80649b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-palette-doc"

RDEPENDS:${PN} += ""

inherit rpm
