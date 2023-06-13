SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "This Package contains necessary the headers for PMI-X."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-headers-3.2.3-10.1.noarch.rpm"
RPM_HASH = "698cb874c2e633fd2b7cc4197899491a5c0a8aabf48a61ae2796b3907a897037446c2d144d03b79c7fedd11e4da6e9a748e06438dfb490940994fa2ff47c9146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pmix-headers"

RDEPENDS:${PN} += ""

inherit rpm
