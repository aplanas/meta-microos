SUMMARY = "Documentation for texlive-pst-vehicle"
DESCRIPTION = "This package includes the documentation for texlive-pst-vehicle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-doc-2023.209.1.3svn61438-54.1.noarch.rpm"
RPM_HASH = "acc1dacd0178bba87fa3a594ffa864169099512a9d176e6c10ead48da7cc3ca7b968cd7a0c1f5cdccd0b1c398d4d5cb8749682ffbf47b275db7bd046ed0480ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vehicle-doc-fr \
texlive-pst-vehicle-doc"

RDEPENDS:${PN} += ""

inherit rpm
