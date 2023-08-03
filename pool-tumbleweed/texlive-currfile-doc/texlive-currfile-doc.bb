SUMMARY = "Documentation for texlive-currfile"
DESCRIPTION = "This package includes the documentation for texlive-currfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn64673"

RPM_NAME = "texlive-currfile-doc-2023.209.0.0.8svn64673-55.1.noarch.rpm"
RPM_HASH = "a7d84119be70b03e08779164d8ae55e61119db64d4857318c109bda96fda706c07401af18041f9e3cd5f88d4a8a08d3c52fcbdef450141d4c0029ae3af496c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
