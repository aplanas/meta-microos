SUMMARY = "Documentation for texlive-resphilosophica"
DESCRIPTION = "This package includes the documentation for texlive-resphilosophica"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-doc-2023.201.1.35svn50935-53.2.noarch.rpm"
RPM_HASH = "ea6edbcd317d9fd11594a00f2f94be2672fa58dfd325e43fc3157a48cefcc5a586a3141d5d6f56a6ca36a72188c6eb6e592b1d2fae2f34afce3d18658623a4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resphilosophica-doc"

RDEPENDS:${PN} += ""

inherit rpm
