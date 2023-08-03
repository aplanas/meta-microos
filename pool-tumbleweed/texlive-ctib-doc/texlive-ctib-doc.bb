SUMMARY = "Documentation for texlive-ctib"
DESCRIPTION = "This package includes the documentation for texlive-ctib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ctib-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "47f7bd8e055f5ce92114b03810e553c36726ba8e7422054d8f0caaf7b264357e9e0e5388899fa7184e301f9c3c61e9b9dff1c9739776476d9d1bd96247aa9196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctib-doc"

RDEPENDS:${PN} += ""

inherit rpm
