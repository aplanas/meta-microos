SUMMARY = "Documentation for texlive-colorprofiles"
DESCRIPTION = "This package includes the documentation for texlive-colorprofiles"
LICENSE = "LPPL-1.0"

PV = "2023.209.20181105svn49086"

RPM_NAME = "texlive-colorprofiles-doc-2023.209.20181105svn49086-54.1.noarch.rpm"
RPM_HASH = "49818ee5616bb1aa097a70bfe795238c0576f45b4583400ee4baec843e5f32ea6d22835368e61f81a49aa2b50b044039019834aaec4e9f3d3682e63281880537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorprofiles-doc"

RDEPENDS:${PN} += ""

inherit rpm
