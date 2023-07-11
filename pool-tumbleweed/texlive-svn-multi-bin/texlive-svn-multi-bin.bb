SUMMARY = "Binary files of svn-multi"
DESCRIPTION = "Binary files of svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-svn-multi-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "ea2361f9ffa1e74872260e87fc4d79e4b3ced6d09b88f89773297cb0d5ec1867c508bd439824f03e9ad9e5908e536b903bd2a6bbc272dfc43dfbb8281f96c3b4"

RPROVIDES:${PN} += "texlive-svn-multi-bin"

RDEPENDS:${PN} += "texlive-svn-multi"

inherit rpm
