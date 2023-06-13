SUMMARY = "Documentation for Oggz"
DESCRIPTION = "This package contains HTML documentation needed for development using \
liboggz"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "liboggz-doc-1.1.1-15.28.noarch.rpm"
RPM_HASH = "a9efc8ca890ddc76e9a11505b6c3b6796b64bc0b301c5bfa20692d2da7c1a53a911c616ade07a309e381b5d3dcad80a8a1528ecaf2b698bc78a067d43ee0f31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liboggz-doc"

RDEPENDS:${PN} += "liboggz2"

inherit rpm
