SUMMARY = "Documentation for texlive-inlinedef"
DESCRIPTION = "This package includes the documentation for texlive-inlinedef"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-inlinedef-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "9ea3eb654a21ab9ef6ea75947f565f294641937a90cbbce03d4a2d0c2f0947360832b4c23a7746ef73d45d7c9e48a2db246ae43583ef474b6b15ea5c8446279e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinedef-doc"

RDEPENDS:${PN} += ""

inherit rpm
