SUMMARY = "Documentation for texlive-pdf14"
DESCRIPTION = "This package includes the documentation for texlive-pdf14"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn17583"

RPM_NAME = "texlive-pdf14-doc-2023.201.0.0.1svn17583-51.1.noarch.rpm"
RPM_HASH = "90284789e27d4b67f37db34c9c63228cadf46c4671e3e71fd47dafb408d557ea631314a3fd40fb79e07743d3a8449c580c815a05d015b94997a60256b35169e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdf14-doc"

RDEPENDS:${PN} += ""

inherit rpm
