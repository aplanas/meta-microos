SUMMARY = "Documentation for texlive-yamlvars"
DESCRIPTION = "This package includes the documentation for texlive-yamlvars"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64949"

RPM_NAME = "texlive-yamlvars-doc-2023.201.svn64949-52.2.noarch.rpm"
RPM_HASH = "95f1f739b8667b9134cd6f00d1d1a0ef05c2155b24e2e2b7567973fdd7cabff2c29a07f8b3db541d5f84ca594c7a557bc9f374729a834fe486803144bcd437df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yamlvars-doc"

RDEPENDS:${PN} += ""

inherit rpm
