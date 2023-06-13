SUMMARY = "Documentation for texlive-context-account"
DESCRIPTION = "This package includes the documentation for texlive-context-account"
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-account-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "6844af3f624ab84fdba2e190cce50423cbcd40b861713f9688422d46e65c52e266c294892e8271079a6fc28ae935e3163db0b38fedf9e57e9e4548f5f0dd3338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-account-doc"

RDEPENDS:${PN} += ""

inherit rpm
