SUMMARY = "Documentation for texlive-plimsoll"
DESCRIPTION = "This package includes the documentation for texlive-plimsoll"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn56605"

RPM_NAME = "texlive-plimsoll-doc-2023.201.1svn56605-52.1.noarch.rpm"
RPM_HASH = "9eeba9f072b21d7881892f92f31ee8acc633218612ea73b50e1b99b3579710320d46bcc2d39144c35e92ed23bbefb1d33b5e5edd3198a56a5f1b93af5213edd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plimsoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
