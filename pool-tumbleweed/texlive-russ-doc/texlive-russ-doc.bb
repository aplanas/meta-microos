SUMMARY = "Documentation for texlive-russ"
DESCRIPTION = "This package includes the documentation for texlive-russ"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25209"

RPM_NAME = "texlive-russ-doc-2023.201.svn25209-53.1.noarch.rpm"
RPM_HASH = "450703de49d9a258850c242b7e89c9ab83f05dee5eac01fb6518f9e4fd1a9010cbfe1584debbe2100b53693c16b49a5a1ad4a935043421b23651bc02186274c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-russ-doc:en;ru) \
texlive-russ-doc"

RDEPENDS:${PN} += ""

inherit rpm
