SUMMARY = "Documentation for texlive-songbook"
DESCRIPTION = "This package includes the documentation for texlive-songbook"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.4.5svn18136"

RPM_NAME = "texlive-songbook-doc-2023.201.4.5svn18136-57.1.noarch.rpm"
RPM_HASH = "27c480a7b9980384e085e1e901c2802567c5d3a515fa84c6b096335f0babbe0e7cdc0b8fa4a08635fb5ff96381d44320d84e2a3f966d4ec298f03ef650937590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songbook-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
