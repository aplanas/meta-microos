SUMMARY = "Documentation for texlive-gothic"
DESCRIPTION = "This package includes the documentation for texlive-gothic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49869"

RPM_NAME = "texlive-gothic-doc-2023.209.svn49869-54.2.noarch.rpm"
RPM_HASH = "5fb2904a6422dc8a2a2b3ff4ecbc33e4c29e7e7dad9743640dbd1b4bd732750476775b56892de55eeb6315fee440ee75d75709c8a505d7068407205ff218e01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gothic-doc"

RDEPENDS:${PN} += ""

inherit rpm
