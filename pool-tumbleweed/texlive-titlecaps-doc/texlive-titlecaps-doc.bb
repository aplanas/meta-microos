SUMMARY = "Documentation for texlive-titlecaps"
DESCRIPTION = "This package includes the documentation for texlive-titlecaps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn63020"

RPM_NAME = "texlive-titlecaps-doc-2023.201.1.3svn63020-52.1.noarch.rpm"
RPM_HASH = "03b43f9664307e186b23b8ff38434873a9379a58f22df422ff4f321e20740947c2adb2c245b9274eb30d51480e03cd8567087e6c4a599e6e898436c41a02f22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlecaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
