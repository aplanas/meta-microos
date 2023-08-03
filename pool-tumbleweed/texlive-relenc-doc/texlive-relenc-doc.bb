SUMMARY = "Documentation for texlive-relenc"
DESCRIPTION = "This package includes the documentation for texlive-relenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22050"

RPM_NAME = "texlive-relenc-doc-2023.209.svn22050-54.1.noarch.rpm"
RPM_HASH = "1b28b8d810e318e3709e07d96d8f33b2dae2ca2dabe2f827e88d68b35a5272d3f2ccbca910255d6130cfdb62df451ae2038decdd50ae258a622349a9bbb47d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
