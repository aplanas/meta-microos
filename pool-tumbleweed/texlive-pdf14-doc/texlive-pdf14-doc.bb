SUMMARY = "Documentation for texlive-pdf14"
DESCRIPTION = "This package includes the documentation for texlive-pdf14"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn17583"

RPM_NAME = "texlive-pdf14-doc-2023.209.0.0.1svn17583-52.1.noarch.rpm"
RPM_HASH = "1b802f13e301155a25f9b248a870747d25fca83219ba6088b597e033e90c131eaadaaf085304800fab2c34b80df8606da824921be2b8caa102d9078cfb65c232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdf14-doc"

RDEPENDS:${PN} += ""

inherit rpm
