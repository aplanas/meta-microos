SUMMARY = "Documentation for texlive-babel-russian"
DESCRIPTION = "This package includes the documentation for texlive-babel-russian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3msvn57376"

RPM_NAME = "texlive-babel-russian-doc-2023.201.1.3msvn57376-53.1.noarch.rpm"
RPM_HASH = "26fc1d2ecdfad0d5e89f292fc3c158957fddfc7c1028873a074ab27e8cbc7bc00d5aa3ec5414c7ce4646f084e7e3a5d530226d47d871cec79b481232f8d0bffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-russian-doc"

RDEPENDS:${PN} += ""

inherit rpm
