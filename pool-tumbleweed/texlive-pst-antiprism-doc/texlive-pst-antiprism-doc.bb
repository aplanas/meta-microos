SUMMARY = "Documentation for texlive-pst-antiprism"
DESCRIPTION = "This package includes the documentation for texlive-pst-antiprism"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn46643"

RPM_NAME = "texlive-pst-antiprism-doc-2023.209.0.0.02svn46643-53.1.noarch.rpm"
RPM_HASH = "01b1e37507bd0b82ea60c99d261faab305e3ab4710d99bfa9814d1c27385928cbbcc83501eda5dcbddd54c8e185ee1d9e617bdab95055c951c54db80c792eeb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-antiprism-doc"

RDEPENDS:${PN} += ""

inherit rpm
