SUMMARY = "Documentation for texlive-qsymbols"
DESCRIPTION = "This package includes the documentation for texlive-qsymbols"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qsymbols-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "f3af51ce663accd3da43a868244b2596f803a483f0e9e6792d8002344cbc59747bc4b6e126c3dfad7be721144eabc7a83b212631e7eaa4a1a74c44aa13ee2353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
