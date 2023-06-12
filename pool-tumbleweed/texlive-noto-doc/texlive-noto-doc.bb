SUMMARY = "Documentation for texlive-noto"
DESCRIPTION = "This package includes the documentation for texlive-noto"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64351"

RPM_NAME = "texlive-noto-doc-2023.201.svn64351-54.1.noarch.rpm"
RPM_HASH = "1b46df4a43c4b8a196ae689671408dbd9e2f797fc6cc2f6a63dfb07280ca019e97db3648a9947cddaaeec34029a8299102d9a20acd82b770b950a1c83fcf9c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-doc"
RDEPENDS:${PN} += ""

inherit rpm
