SUMMARY = "Documentation for texlive-pgfgantt"
DESCRIPTION = "This package includes the documentation for texlive-pgfgantt"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn52662"

RPM_NAME = "texlive-pgfgantt-doc-2023.209.5.0svn52662-52.1.noarch.rpm"
RPM_HASH = "7649481bff2d83b005af283d2a00331934ac789e2f0515e8edd359eda2425e968d6ec1f556b76bb9c6b05f2cb417296da50d029d74906834514046d867ff3749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfgantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
