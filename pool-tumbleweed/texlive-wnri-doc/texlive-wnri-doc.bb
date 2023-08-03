SUMMARY = "Documentation for texlive-wnri"
DESCRIPTION = "This package includes the documentation for texlive-wnri"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22459"

RPM_NAME = "texlive-wnri-doc-2023.209.svn22459-54.1.noarch.rpm"
RPM_HASH = "18950f89433f60ab30275abc642bf6e359cecc6f19ee57f4eddb1afe12584db2e81bb594b8ca07b843aa78420c105beca99f86b9501d52710dc7668c8840d5cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wnri-doc"

RDEPENDS:${PN} += ""

inherit rpm
