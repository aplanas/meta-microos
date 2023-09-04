SUMMARY = "Documentation for texlive-hackthefootline"
DESCRIPTION = "This package includes the documentation for texlive-hackthefootline"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46494"

RPM_NAME = "texlive-hackthefootline-doc-2023.209.svn46494-54.2.noarch.rpm"
RPM_HASH = "9c69e083d577b977a06c3c29dfb22ce88d14f843dfc5f0a9b359a14f9213a9b6183e3f1dd7d546560fef9596269e5e6db4095257c9be941b3708fcf585b7741c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hackthefootline-doc"

RDEPENDS:${PN} += ""

inherit rpm
