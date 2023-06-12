SUMMARY = "Documentation for the libspandsp API"
DESCRIPTION = "This package contains documentation for the libspandsp API."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.0.g15"

RPM_NAME = "spandsp-doc-3.0.0.g15-3.1.noarch.rpm"
RPM_HASH = "936c22fda06102a94b32fb92e4367d5a214a8edffbfaf39269301d9cdf748b8427886d2d48012863ac01edcc48fcfb8b722dce0bccfaf84a2b9e764a1fb78469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spandsp-doc"
RDEPENDS:${PN} += ""

inherit rpm
