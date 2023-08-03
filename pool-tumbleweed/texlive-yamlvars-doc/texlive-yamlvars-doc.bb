SUMMARY = "Documentation for texlive-yamlvars"
DESCRIPTION = "This package includes the documentation for texlive-yamlvars"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64949"

RPM_NAME = "texlive-yamlvars-doc-2023.209.svn64949-53.1.noarch.rpm"
RPM_HASH = "11d147ddba23b496650b1ac9ba0cdbc76f489080e96e4fa419f47444fe342962077015d72f60a87886db999b686bc00a3ed1e1508e214e78a27d2f39224bc2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yamlvars-doc"

RDEPENDS:${PN} += ""

inherit rpm
