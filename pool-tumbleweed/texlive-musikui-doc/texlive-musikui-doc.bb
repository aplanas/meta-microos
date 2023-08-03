SUMMARY = "Documentation for texlive-musikui"
DESCRIPTION = "This package includes the documentation for texlive-musikui"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn47472"

RPM_NAME = "texlive-musikui-doc-2023.209.1svn47472-55.1.noarch.rpm"
RPM_HASH = "ce47c67bce701cf858d9e82444e330c3da5df21f96fc0c2398b4d140f565647f49e2a27b22b79795913ae0679af40f8e9422f0c59fef3062229645163290c149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musikui-doc"

RDEPENDS:${PN} += ""

inherit rpm
