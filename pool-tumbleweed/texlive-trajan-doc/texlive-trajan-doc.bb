SUMMARY = "Documentation for texlive-trajan"
DESCRIPTION = "This package includes the documentation for texlive-trajan"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-trajan-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "cd9d616f9a8fc6a1a1ecb4043865210fc1d17f2363336db119473eb8507502b31be1f0f34b7018d687c4c6825cfc047e8220fbf7e411a3c8d20ad00835e88ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trajan-doc"

RDEPENDS:${PN} += ""

inherit rpm
