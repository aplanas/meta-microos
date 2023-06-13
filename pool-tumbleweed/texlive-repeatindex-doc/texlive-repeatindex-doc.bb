SUMMARY = "Documentation for texlive-repeatindex"
DESCRIPTION = "This package includes the documentation for texlive-repeatindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-doc-2023.201.0.0.01svn24305-53.1.noarch.rpm"
RPM_HASH = "a67648aa83d9762eabe493841f70d56e5af164b82e540d60973d9765f9cbc8e8a5328f208a441f3c0ea065535d12a50be5b2a70deb1c54b5c49150ca47d41619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repeatindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
