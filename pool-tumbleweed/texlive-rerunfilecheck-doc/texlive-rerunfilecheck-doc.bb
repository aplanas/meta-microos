SUMMARY = "Documentation for texlive-rerunfilecheck"
DESCRIPTION = "This package includes the documentation for texlive-rerunfilecheck"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-doc-2023.209.1.10svn63869-54.2.noarch.rpm"
RPM_HASH = "8d83d8380b62170fd79c8dcf10d83b19eff9dea9f68376c6af133c39191a9a64b8c64dad8fa3d4517752882e674e9a66e06cff3a5f68b6c0048eff0c60e4ddee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rerunfilecheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
