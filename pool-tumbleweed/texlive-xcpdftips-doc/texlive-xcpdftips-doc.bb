SUMMARY = "Documentation for texlive-xcpdftips"
DESCRIPTION = "This package includes the documentation for texlive-xcpdftips"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-doc-2023.201.1.1svn50449-52.2.noarch.rpm"
RPM_HASH = "52eacf51c4b011c06fdb0a9bf0dd4bf062a45bd8232512f56e03dfe17411cc3952cac43b269e23ab319154377343038000152ff442ac92409a68976c6b6dfc73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcpdftips-doc"

RDEPENDS:${PN} += ""

inherit rpm
