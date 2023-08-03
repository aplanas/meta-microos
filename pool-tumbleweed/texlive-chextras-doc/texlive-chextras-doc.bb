SUMMARY = "Documentation for texlive-chextras"
DESCRIPTION = "This package includes the documentation for texlive-chextras"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn27118"

RPM_NAME = "texlive-chextras-doc-2023.209.1.01svn27118-54.1.noarch.rpm"
RPM_HASH = "016950b6e02fe1a40642f44d39dda542aef1e74f1990bcbd920782800a7c0ba5c2b6e769cbdded44df21c208bc0daed3f2e515846d4a0250753d9a26a0ab048e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chextras-doc"

RDEPENDS:${PN} += ""

inherit rpm
