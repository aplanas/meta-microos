SUMMARY = "API documentation for taglib"
DESCRIPTION = "This package contains the taglib API Documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag-doc-1.13-1.2.noarch.rpm"
RPM_HASH = "9837d1e3b635e27ae3b447654766a8c6a06e75318ba1fe2a0450e217630ad46ca1988a905c7aec046d37472b31116afc28954296bdd5848b6a501b813a13835f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtag-doc"

RDEPENDS:${PN} += ""

inherit rpm
