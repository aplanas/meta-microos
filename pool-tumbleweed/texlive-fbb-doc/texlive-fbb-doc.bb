SUMMARY = "Documentation for texlive-fbb"
DESCRIPTION = "This package includes the documentation for texlive-fbb"
LICENSE = "OFL-1.1"

PV = "2023.201.1.16svn55728"

RPM_NAME = "texlive-fbb-doc-2023.201.1.16svn55728-52.1.noarch.rpm"
RPM_HASH = "9a0436d7d06ea397a4ef4910ae3cc196a788122a897defc8c6d334e809cec6caa086684f5183e3b50e76e7618c743de405f79ed68cbac6a3a9935bc12612102d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
