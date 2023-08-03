SUMMARY = "Documentation for texlive-sillypage"
DESCRIPTION = "This package includes the documentation for texlive-sillypage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn66349"

RPM_NAME = "texlive-sillypage-doc-2023.209.1.6svn66349-54.1.noarch.rpm"
RPM_HASH = "44722ad812558f34f1ef3d43d323890681563c1fb79a05f856dd4b35c6a40af23dbd8e99d0a6967fb4074b7486b9930742f25be06f3dbdcc01933756679c459e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sillypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
