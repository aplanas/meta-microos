SUMMARY = "Documentation for texlive-cm-unicode"
DESCRIPTION = "This package includes the documentation for texlive-cm-unicode"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.7.0svn58661"

RPM_NAME = "texlive-cm-unicode-doc-2023.201.0.0.7.0svn58661-53.1.noarch.rpm"
RPM_HASH = "95bd3ff951075ba21684b8dabaa50b46ed0f1e13722c8c70310246ba30e30cf9950db1a117b0d9136e32b82da1675ab8e65d090c71aae537d87794f8add52bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-unicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
