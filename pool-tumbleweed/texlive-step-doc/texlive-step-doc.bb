SUMMARY = "Documentation for texlive-step"
DESCRIPTION = "This package includes the documentation for texlive-step"
LICENSE = "OFL-1.1"

PV = "2023.209.2.0.5svn57307"

RPM_NAME = "texlive-step-doc-2023.209.2.0.5svn57307-58.1.noarch.rpm"
RPM_HASH = "7d73acd4ec8626b3f83a978031e56e0b1b1f1b22591c3d2d16a4d9fb0f4136a7f7a365c4ee7a788859814e54f9b928a02fea5f9239d4093b4a0357ed403c7313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-step-doc"

RDEPENDS:${PN} += ""

inherit rpm
