SUMMARY = "Documentation for the GNU Core Utilities"
DESCRIPTION = "This package contains the documentation for the GNU Core Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "9.3"

RPM_NAME = "coreutils-doc-9.3-1.1.noarch.rpm"
RPM_HASH = "3f8aae037c7439dadab51a11027b81cf7440d56b3dad25d45aab4a827989b68351dfd71ca8862306567e1d4179491243226f0fe9fc3a6e4478a8a218cefc1d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-doc coreutils:/usr/share/info/coreutils.info.gz"
RDEPENDS:${PN} += ""

inherit rpm
