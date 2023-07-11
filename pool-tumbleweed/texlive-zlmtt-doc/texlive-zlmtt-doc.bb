SUMMARY = "Documentation for texlive-zlmtt"
DESCRIPTION = "This package includes the documentation for texlive-zlmtt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn64076"

RPM_NAME = "texlive-zlmtt-doc-2023.201.1.032svn64076-52.2.noarch.rpm"
RPM_HASH = "5dd9bf59979c88cc1ac9774838845e1eedbed2309b443cff90af6f791c079f9abeac32a9c94bc468f0f1f64f07a52a93b8a9d4908baf8f4421c48af8b504215a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zlmtt-doc"

RDEPENDS:${PN} += ""

inherit rpm
