SUMMARY = "Documentation for texlive-parrun"
DESCRIPTION = "This package includes the documentation for texlive-parrun"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-parrun-doc-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "c07c432533096cfc76f99cb2976fea49f356d95ad53594d1d9d07361265d575f1c866c9bd21e3b1083cd3da89db21b10b73d13f7165b9a65a03e941936fa25c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parrun-doc"

RDEPENDS:${PN} += ""

inherit rpm
