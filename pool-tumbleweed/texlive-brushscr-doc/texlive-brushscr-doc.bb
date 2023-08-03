SUMMARY = "Documentation for texlive-brushscr"
DESCRIPTION = "This package includes the documentation for texlive-brushscr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28363"

RPM_NAME = "texlive-brushscr-doc-2023.209.svn28363-53.1.noarch.rpm"
RPM_HASH = "ae71986e0f7640cff8b2305d8c72abb05daf103f382141c0a46f0184588634e762f41a5934a5b561b51c3a7566a37be0dd9e98847d0e466aa9c9fdf502cb31ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brushscr-doc"

RDEPENDS:${PN} += ""

inherit rpm
