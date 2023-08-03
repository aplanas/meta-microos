SUMMARY = "Documentation for texlive-quantikz"
DESCRIPTION = "This package includes the documentation for texlive-quantikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-doc-2023.209.0.0.9.6svn54911-54.1.noarch.rpm"
RPM_HASH = "93454cbe2a78e7765c3e491278766d93ec4d806a8cc6f94261ee551d4f1b5027043357f43a83a8f61219d514a5593e0e31e65f5d8c815b6939c1c9b7c0b6c306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
