SUMMARY = "Documentation for texlive-unicode-bidi"
DESCRIPTION = "This package includes the documentation for texlive-unicode-bidi"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn42482"

RPM_NAME = "texlive-unicode-bidi-doc-2023.201.0.0.01svn42482-53.1.noarch.rpm"
RPM_HASH = "69aeb381882ca39356b7480adeb4857836550c3a748f1ea84a65baa754e71b13b9d37fe933f328f6f00aa89161a116fd098ef94495c56079a4dd9cea7ea7214e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-bidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
