SUMMARY = "Documentation for texlive-outline"
DESCRIPTION = "This package includes the documentation for texlive-outline"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18360"

RPM_NAME = "texlive-outline-doc-2023.201.svn18360-54.1.noarch.rpm"
RPM_HASH = "3bd3c16382cfe09a881515c0500bfd5bfe8d1aa109f16afa7df1bea3ac50e631ddb78872c75ca858c590b6f713e26f3d1e0a31adb2d355fdf6bfa80a7837f1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outline-doc"

RDEPENDS:${PN} += ""

inherit rpm
