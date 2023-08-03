SUMMARY = "Documentation for texlive-utopia"
DESCRIPTION = "This package includes the documentation for texlive-utopia"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-utopia-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0eb3a1bf67d27ede94517cd631b960769f39afdc0f779ff0041edabccd9f8ce8c4699089b95781b3d0466dc270b7b45979fc857450a1af5cce8f116e3f00f28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utopia-doc"

RDEPENDS:${PN} += ""

inherit rpm
