SUMMARY = "Documentation for texlive-babel-japanese"
DESCRIPTION = "This package includes the documentation for texlive-babel-japanese"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57733"

RPM_NAME = "texlive-babel-japanese-doc-2023.209.svn57733-54.1.noarch.rpm"
RPM_HASH = "e0fb62982283978d3143ad0a2818da8820e9aca06abc01c6dda7170204d76ca70f73e0cc17e1f858259c4068b6ff89783e42d90dbb12159e85a5a0992eda34df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-babel-japanese-doc-ja;en \
texlive-babel-japanese-doc"

RDEPENDS:${PN} += ""

inherit rpm
