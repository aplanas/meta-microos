SUMMARY = "Documentation for texlive-mtgreek"
DESCRIPTION = "This package includes the documentation for texlive-mtgreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1+svn17967"

RPM_NAME = "texlive-mtgreek-doc-2023.201.1.1+svn17967-54.1.noarch.rpm"
RPM_HASH = "507b6c9412500ab4334e72fa93ef0e8f43cac72f739d6e42de03d1d86db0674ab62ff942d20f99a771e55bbf4e8930d1c052fc5de4b28b16cefbee84dd2ccd86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mtgreek-doc"
RDEPENDS:${PN} += ""

inherit rpm
