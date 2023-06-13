SUMMARY = "Documentation for texlive-genmpage"
DESCRIPTION = "This package includes the documentation for texlive-genmpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1svn15878"

RPM_NAME = "texlive-genmpage-doc-2023.201.0.0.3.1svn15878-52.1.noarch.rpm"
RPM_HASH = "9c5c4d874c4c89a7037d28de76f2eec8b7f903e191827560187489ac1bbc62980a552ec2a3c9579b150d7d9bcb29c02dfd31cae7997f1f73763f57549bc57f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
