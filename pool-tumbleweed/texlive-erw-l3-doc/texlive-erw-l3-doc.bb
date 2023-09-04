SUMMARY = "Documentation for texlive-erw-l3"
DESCRIPTION = "This package includes the documentation for texlive-erw-l3"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn61799"

RPM_NAME = "texlive-erw-l3-doc-2023.209.4.2svn61799-54.2.noarch.rpm"
RPM_HASH = "ebb1a3d11d5aa7417e962305ffd000e9739cfeb4320a6a37b9659ee87b55a509752c45452b22ff9bd27acfaa45ef76ec7f3c9c26305000c873306775b3cd60ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erw-l3-doc"

RDEPENDS:${PN} += ""

inherit rpm
