SUMMARY = "Documentation for texlive-texdef"
DESCRIPTION = "This package includes the documentation for texlive-texdef"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.9svn64967"

RPM_NAME = "texlive-texdef-doc-2023.201.1.9svn64967-54.1.noarch.rpm"
RPM_HASH = "d06b51e1ad4f6e18c59e312a37e621ef3a9818c54b3f940f4e6cc189f79cd72a7a62a81eeb0631ae7ac8998be4b778a0d9093c11578427b197ff928afe0fe9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
