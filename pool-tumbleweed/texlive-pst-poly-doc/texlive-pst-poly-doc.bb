SUMMARY = "Documentation for texlive-pst-poly"
DESCRIPTION = "This package includes the documentation for texlive-pst-poly"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63svn35062"

RPM_NAME = "texlive-pst-poly-doc-2023.209.1.63svn35062-54.2.noarch.rpm"
RPM_HASH = "83a9bcc36d0ffbbb84b7d222f7c19012c329d34025f37f285996ab520e37dcf5dd26016035d1e3ea5694fad2c638895f195f0f3be49f6065ddb866c4c0235bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poly-doc"

RDEPENDS:${PN} += ""

inherit rpm
