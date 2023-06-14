SUMMARY = "Documentation for texlive-tuda-ci"
DESCRIPTION = "This package includes the documentation for texlive-tuda-ci"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.29svn65254"

RPM_NAME = "texlive-tuda-ci-doc-2023.201.3.29svn65254-52.1.noarch.rpm"
RPM_HASH = "9e0c3df657c8717b2cd0ea167701e95c1cdba442ad18aef74326810ca8e07c0c14ce7b0f1e59698343390a3d8a1551a4c83a75fb1179e13e927381c93ab2dede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tuda-ci-doc-de \
texlive-tuda-ci-doc"

RDEPENDS:${PN} += ""

inherit rpm
