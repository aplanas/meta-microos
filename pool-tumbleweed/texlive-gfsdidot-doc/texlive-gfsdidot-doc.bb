SUMMARY = "Documentation for texlive-gfsdidot"
DESCRIPTION = "This package includes the documentation for texlive-gfsdidot"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-gfsdidot-doc-2023.209.svn54080-53.1.noarch.rpm"
RPM_HASH = "388fe1721c705dab4ded9b41269c1b0f6f918395699e6c8743f97dbc48ff20089ab44fbf58e0bf1df4a9454857127710db9a8d7e34c36e1792a9507748e9998d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidot-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
