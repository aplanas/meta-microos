SUMMARY = "Documentation for texlive-namespc"
DESCRIPTION = "This package includes the documentation for texlive-namespc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-namespc-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "9f736ee12f81a16f6047b7bbb6550295c41fa044315c83fdeea4493cd01974347407d7ea7bb34eac3147319fe482f86b2a200d326dec988ebec54fd686ca63c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namespc-doc"

RDEPENDS:${PN} += ""

inherit rpm
