SUMMARY = "Documentation for texlive-gfsdidot"
DESCRIPTION = "This package includes the documentation for texlive-gfsdidot"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-gfsdidot-doc-2023.201.svn54080-52.1.noarch.rpm"
RPM_HASH = "b5dca006b394e5a609cf28102033181028db4f82bce3196a450a3b0666381d2ff83c8d82aecd09877f6d398a9a68c58aafa53ec2146913cd2232f641b5e9b94b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidot-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
