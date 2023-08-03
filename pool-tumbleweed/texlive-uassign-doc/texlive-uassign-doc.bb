SUMMARY = "Documentation for texlive-uassign"
DESCRIPTION = "This package includes the documentation for texlive-uassign"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn38459"

RPM_NAME = "texlive-uassign-doc-2023.209.1.01svn38459-53.1.noarch.rpm"
RPM_HASH = "aa700e33f93293e99efd03d2e671a606c94bed1c39bb0e18326ae4a67e9fbd5890e903acf4a36e9436b0f489ad96c0c6c663173f43c996c7c84dbc7383c514d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uassign-doc"

RDEPENDS:${PN} += ""

inherit rpm
