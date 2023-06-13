SUMMARY = "Documentation for texlive-texliveonfly"
DESCRIPTION = "This package includes the documentation for texlive-texliveonfly"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn55777"

RPM_NAME = "texlive-texliveonfly-doc-2023.201.svn55777-54.1.noarch.rpm"
RPM_HASH = "da56ab9272ae73ced564d7d714f91edbed5e4461934b1bc8c5b765e77c235898812f4e9a4c0e71853f34d81d489c1ccd007034195f0c34259862b82fec02e8ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texliveonfly-doc"

RDEPENDS:${PN} += ""

inherit rpm
