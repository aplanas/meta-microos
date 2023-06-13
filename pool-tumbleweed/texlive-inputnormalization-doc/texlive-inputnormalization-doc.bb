SUMMARY = "Documentation for texlive-inputnormalization"
DESCRIPTION = "This package includes the documentation for texlive-inputnormalization"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn59850"

RPM_NAME = "texlive-inputnormalization-doc-2023.201.0.0.2svn59850-52.1.noarch.rpm"
RPM_HASH = "cd8b120c795f1150cbbc9d1bf7c3f994b3979b1dc00b189a855e0b0eec2cb8e74ae939d562875c42216fdb0cfd2abaf7ea6eefd404321f5ae491c2db97f63c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputnormalization-doc"

RDEPENDS:${PN} += ""

inherit rpm
