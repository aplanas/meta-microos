SUMMARY = "Documentation for texlive-datetime2-serbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn52893"

RPM_NAME = "texlive-datetime2-serbian-doc-2023.209.2.1.0svn52893-53.1.noarch.rpm"
RPM_HASH = "bfbd621c14ee22eb95d3dd86ffdbd94a39725e7fc81b63e214e86600ac6f42cf3ff85ac24cdfc32f8cb78fbf0d38d85dfce8dda9023c1bc178501cd41a1b5c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
