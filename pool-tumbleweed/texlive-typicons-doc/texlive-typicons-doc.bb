SUMMARY = "Documentation for texlive-typicons"
DESCRIPTION = "This package includes the documentation for texlive-typicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.7svn37623"

RPM_NAME = "texlive-typicons-doc-2023.209.2.0.7svn37623-53.1.noarch.rpm"
RPM_HASH = "e33f4fb7882501f8b17e024a9790bc7c3d07369b594f171829efea43e7bc599900c0e3800fc9a320be0d267679529352527713bd5c97ce7782b9fe650d781308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
