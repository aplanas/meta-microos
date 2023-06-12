SUMMARY = "Documentation for texlive-babel-finnish"
DESCRIPTION = "This package includes the documentation for texlive-babel-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3ssvn57643"

RPM_NAME = "texlive-babel-finnish-doc-2023.201.1.3ssvn57643-53.1.noarch.rpm"
RPM_HASH = "4a57cf0754e46237718f5696df5696ed830ccd19dd8319b6a7f93edc1be2ac428952b412edf458ba8d6e053657c0fe1ecd9859c1c47d301795fad63366e73266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-finnish-doc"
RDEPENDS:${PN} += ""

inherit rpm
