SUMMARY = "Documentation for texlive-babel-croatian"
DESCRIPTION = "This package includes the documentation for texlive-babel-croatian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3lsvn35198"

RPM_NAME = "texlive-babel-croatian-doc-2023.201.1.3lsvn35198-53.1.noarch.rpm"
RPM_HASH = "ddc8a781e99eef3ce85bac310ea74643ec363cb4bf4789af9c81628a3bb2c467a9d79f93cff521cb1007ff822e11e791f25288b5f373aa4cd6bed2681e810f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-croatian-doc"

RDEPENDS:${PN} += ""

inherit rpm
