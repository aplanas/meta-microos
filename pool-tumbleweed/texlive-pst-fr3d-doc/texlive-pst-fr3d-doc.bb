SUMMARY = "Documentation for texlive-pst-fr3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-fr3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn15878"

RPM_NAME = "texlive-pst-fr3d-doc-2023.201.1.10svn15878-52.1.noarch.rpm"
RPM_HASH = "ef99eb780e952cd8da5a4206742e2c9714dba772d76c79df3492231da468a7893a140b64d33f38e456d1bc77e39318b2e57f5633f89ec85ff20808e83a8f33b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fr3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
