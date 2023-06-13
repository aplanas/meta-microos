SUMMARY = "Documentation for texlive-ninecolors"
DESCRIPTION = "This package includes the documentation for texlive-ninecolors"
LICENSE = "LPPL-1.0"

PV = "2023.201.2022dsvn62006"

RPM_NAME = "texlive-ninecolors-doc-2023.201.2022dsvn62006-54.1.noarch.rpm"
RPM_HASH = "1184f64ec177bc9b92fc3407b99bfafb259a84fd1d21aefe13a5a17e7f71349fc3125b46486ab5be26b1bbc3ae10adb3dda9e4ed382271c9721f42e684f13beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ninecolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
