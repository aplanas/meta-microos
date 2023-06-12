SUMMARY = "Documentation for texlive-iscram"
DESCRIPTION = "This package includes the documentation for texlive-iscram"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn45801"

RPM_NAME = "texlive-iscram-doc-2023.201.1.1svn45801-55.1.noarch.rpm"
RPM_HASH = "ca9b0d09461acc74c25cbfa95d99a2831fd33c70d2c45c562949966dccd3f836182b0a78e10e447020c82687dd4e3cf12af2254c61da8268d0bc58139df1466d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iscram-doc"
RDEPENDS:${PN} += ""

inherit rpm
